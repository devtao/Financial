package me.tspace.account.controller;

import me.tspace.account.model.Login;
import me.tspace.account.service.ILoginService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private ILoginService loginService;
	
	@RequestMapping(value="login.do",method=RequestMethod.GET)
	public String initForm(ModelMap model){
		Login login = new Login();
		model.addAttribute("login",login);
		return "loginAndregister";
	}
	
	@RequestMapping(value = "login.do" ,method = RequestMethod.POST)
	public ModelAndView submit(@ModelAttribute("login") Login login){
		logger.info("注册......");
		Login loginin = loginService.checkLoginExists(login);
		ModelAndView mv = new ModelAndView();
		if(loginin!=null){
			//mv.setViewName("redirect:profile.do?userID="+loginin.getLoginId());
			mv.setViewName("redirect:home.do?userID="+loginin.getLoginId());
		}else{
			mv.addObject("errorMsg","用户名或密码不正确,请重新输入!");
			mv.setViewName("loginAndregister");
		}
		return mv;
	}
	
	
/*	
 * 用modelmap实现
 * @RequestMapping(value = "login.do" ,method = RequestMethod.POST)
	public String  submit(@ModelAttribute("login") Login login,ModelMap model){
		logger.debug("注册......");
		Login loginin = loginService.checkLoginExists(login);
		if(loginin!=null){
			 return "redirect:profile.do?userID="+loginin.getLoginId();
		}else{
			model.addAttribute("testerror","aaaa");
			return "loginAndregister";
		}
	}*/
	
}