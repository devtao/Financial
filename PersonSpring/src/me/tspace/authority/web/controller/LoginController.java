package me.tspace.authority.web.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.code.kaptcha.Constants;
import me.tspace.authority.pojo.BaseUsers;
import me.tspace.authority.service.BaseModulesService;
import me.tspace.authority.service.BaseUsersService;
import me.tspace.authority.web.interseptor.WebConstants;
import me.tspace.common.pojo.Criteria;
import me.tspace.common.pojo.ExceptionReturn;
import me.tspace.common.pojo.ExtReturn;
import me.tspace.common.pojo.Tree;
import me.tspace.common.springmvc.DateConvertEditor;

/**
 * 用户登录相关
 * 
 * @author selleck
 * @date 2011-10-20 上午11:45:00
 */
@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private BaseUsersService baseUsersService;
	@Autowired
	private BaseModulesService baseModulesService;

	/** 限制时间 */
	@Value("${limit.millis:3600000}")
	private Long millis;
	@Autowired
	private MessageSource messageSource;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new DateConvertEditor());
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}

	/**
	 * 退出登录
	 */
	@RequestMapping("/logout")
	@ResponseBody
	public Object logout(HttpSession session, Locale locale) {
		try {
			session.removeAttribute(WebConstants.CURRENT_USER);
			session.invalidate();
			return new ExtReturn(true,returnMsg("login.logout",locale));
		} catch (Exception e) {
			logger.error("Exception: ", e);
			return new ExceptionReturn(e);
		}
	}

	/**
	 * 用户菜单treeMenu的数据
	 * 
	 * @throws IOException
	 */
	@RequestMapping("/treeMenu")
	@ResponseBody
	public Object treeMenu(HttpSession session, HttpServletResponse response ,Locale locale) {
		try {
			BaseUsers user = (BaseUsers) session.getAttribute(WebConstants.CURRENT_USER);
			// 得到的是根菜单
			Tree tree = this.baseModulesService.selectModulesByUser(user,messageSource,locale);
			// 返回根菜单下面的子菜单
			return tree.getChildren();
		} catch (Exception e) {
			logger.error("Exception: ", e);
			return new ExceptionReturn(e);
		}
	}
	
	/**
	 * 用户登录
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Object login(@RequestParam String account, @RequestParam String password, HttpSession session, HttpServletRequest request,Locale locale) {
		try {
			if (StringUtils.isBlank(account)) {
				return new ExtReturn(false, returnMsg("common.userAccount.notBlank",locale));
			}
			if (StringUtils.isBlank(password)) {
				return new ExtReturn(false, returnMsg("common.userPassword.notBlank",locale));
			}
			Criteria criteria = new Criteria();
			criteria.put("account", account);
			criteria.put("passwordIn", password);
			criteria.put("loginip", this.getIpAddr(request));
			String result = this.baseUsersService.selectByBaseUser(messageSource,criteria,locale);
			if ("01".equals(result)) {
				BaseUsers baseUser = (BaseUsers) criteria.get("baseUser");
				session.setAttribute(WebConstants.CURRENT_USER, baseUser);
				logger.info("{}登陆成功", baseUser.getRealName());
				return new ExtReturn(true, "success");
			} else if ("00".equals(result)) {
				return new ExtReturn(false, returnMsg("login.error2",locale));
			} else {
				return new ExtReturn(false, result);
			}
		} catch (Exception e) {
			logger.error("Exception: ", e);
			return new ExceptionReturn(e);
		}
	}

	/**
	 * 取得客户端真实ip
	 * 
	 * @param request
	 * @return 客户端真实ip
	 */
	public String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("X-Forwarded-For");
		logger.debug("1- X-Forwarded-For ip={}", ip);
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
			logger.debug("2- Proxy-Client-IP ip={}", ip);
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
			logger.debug("3- WL-Proxy-Client-IP ip={}", ip);
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
			logger.debug("4- HTTP_CLIENT_IP ip={}", ip);
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
			logger.debug("5- HTTP_X_FORWARDED_FOR ip={}", ip);
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
			logger.debug("6- getRemoteAddr ip={}", ip);
		}
		logger.info("finally ip={}", ip);
		return ip;
	}

	/**
	 * 转到找回用户密码页面
	 */
	@RequestMapping(value = "/findpwd", method = RequestMethod.GET)
	public String findpwd() {
		return "user/findpwd";
	}

	/**
	 * 找回用户密码
	 */
	@RequestMapping(value = "/findpwd", method = RequestMethod.POST)
	@ResponseBody
	public Object saveFindpwd(BaseUsers user,@RequestParam String captcha,HttpSession session,Locale locale) {
		try {
			if (StringUtils.isBlank(captcha)) {
				return new ExtReturn(false, returnMsg("common.securityCode.notBlank",locale));
			}
			Object sessionCaptcha =  session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
			if(null==sessionCaptcha){
				return new ExtReturn(false, returnMsg("login.validCodeFail",locale));
			}
			if (!captcha.equalsIgnoreCase((String)sessionCaptcha)) {
				return new ExtReturn(false, returnMsg("login.validCodeFail1",locale));
			}
			//移除验证码，不能用同一个验证码重复提交来试探密码等，不要想铁道部的网站那样
			session.removeAttribute(Constants.KAPTCHA_SESSION_KEY);
			if (user == null) {
				return new ExtReturn(false, returnMsg("login.userError",locale));
			}
			if (StringUtils.isBlank(user.getAccount())) {
				return new ExtReturn(false, returnMsg("common.userAccount.notBlank",locale));
			}
			if (StringUtils.isBlank(user.getEmail())) {
				return new ExtReturn(false, returnMsg("login.userError1",locale));
			}
			Criteria criteria = new Criteria();
			criteria.put("user", user);
			String result = this.baseUsersService.findPassword(messageSource,criteria,locale);
			if ("01".equals(result)) {
				return new ExtReturn(true, returnMsg("login.success",locale));
			} else if ("00".equals(result)) {
				return new ExtReturn(false, returnMsg("login.userError2",locale));
			} else {
				return new ExtReturn(false, result);
			}
		} catch (Exception e) {
			logger.error("Exception: ", e);
			return new ExceptionReturn(e);
		}
	}

	/**
	 * 找回用户密码时的重新设置密码的页面
	 */
	@RequestMapping(value = "/resetpwd/{token}/{userId}", method = RequestMethod.GET)
	public String resetpwd(@PathVariable String token, @PathVariable String userId, Model model,Locale locale) {
		BaseUsers user = this.baseUsersService.selectByPrimaryKey(userId);
		if (user == null || !user.getPassword().equals(token.toLowerCase()) || compareTo(user.getLastLoginTime())) {
			model.addAttribute("error", returnMsg("login.userError3",locale));
			return "user/resetpwd";
		}
		model.addAttribute("t", token);
		model.addAttribute("u", userId);
		return "user/resetpwd";
	}

	/**
	 * 找回用户密码时的重新设置密码的页面
	 */
	@RequestMapping(value = "/resetpwd", method = RequestMethod.POST)
	public String resetpwdSave(@RequestParam String u, @RequestParam String t, @RequestParam String newpwd, @RequestParam String renewpwd,
			Model model,Locale locale) {
		try {
			model.addAttribute("t", t);
			model.addAttribute("u", u);
			if (StringUtils.isBlank(u)) {
				model.addAttribute("msg", returnMsg("login.userError4",locale));
				return "user/resetpwd";
			}
			if (StringUtils.isBlank(t)) {
				model.addAttribute("msg", returnMsg("login.userError4",locale));
				return "user/resetpwd";
			}
			if (StringUtils.isBlank(newpwd)) {
				model.addAttribute("msg", returnMsg("login.userError5",locale));
				return "user/resetpwd";
			}
			if (StringUtils.isBlank(renewpwd)) {
				model.addAttribute("msg", returnMsg("user.error4",locale));
				return "user/resetpwd";
			}
			if (!renewpwd.equals(newpwd)) {
				model.addAttribute("msg", returnMsg("login.userError6",locale));
				return "user/resetpwd";
			}
			Criteria criteria = new Criteria();
			criteria.put("token", t);
			criteria.put("userId", u);
			criteria.put("password", newpwd);
			String result = this.baseUsersService.updatePassword(criteria);
			if ("01".equals(result)) {
				model.addAttribute("msg", returnMsg("login.success1",locale));
			} else if ("00".equals(result)) {
				model.addAttribute("msg", returnMsg("login.userError4",locale));
			} else {
				model.addAttribute("msg", result);
			}
		} catch (Exception e) {
			logger.error("Exception: ", e);
			model.addAttribute("msg", e.getMessage());
		}
		return "user/resetpwd";
	}

	/**
	 * 日期比较
	 * 
	 * @param date
	 * @return
	 */
	private boolean compareTo(Date date) {
		Calendar c = Calendar.getInstance();
		long now = c.getTimeInMillis();
		c.setTime(date);
		long lastly = c.getTimeInMillis();
		// 60分钟1000*60*60;
		return (now - lastly) >= millis;
	}
	
	private String returnMsg(String str,Locale locale){
		return messageSource.getMessage(str, null, "Default", locale);
	}
}
