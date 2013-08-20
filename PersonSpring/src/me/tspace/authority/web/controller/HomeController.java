package me.tspace.authority.web.controller;

import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import me.tspace.authority.service.BaseFieldsService;
import me.tspace.common.pojo.Criteria;

/**
 * 主页面
 * 
 * @author selleck
 * @date 2011-11-2 下午2:03:20
 */
@Controller
public class HomeController {

	@Autowired
	MessageSource messageSource;
	
	@Autowired
	private BaseFieldsService baseFieldsService;
	
	/**
	 * 主页
	 */
	@RequestMapping("/")
	public String home(HttpSession session,Locale locale) {
		initLocaleCollections(session, locale);
		// 转到登录页面
		return "login";
	}

	/**
	 * 主页面
	 */
	@RequestMapping("/main")
	public String main(HttpSession session,Locale locale) {
		initLocaleCollections(session, locale);
		return "main";
	}

	/**
	 * 头部
	 */
	@RequestMapping("/header")
	public String header() {
		return "header";
	}

	/**
	 * 欢迎界面
	 */
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	private void initLocaleCollections(HttpSession session,Locale locale){
		Object fieldsObj = "zh".equals(locale.getLanguage()) ? 
				            session.getServletContext().getAttribute("zh_fields"):
				            session.getServletContext().getAttribute("en_fields");
		if(fieldsObj==null){//初始化系统字段
			Map<String,String> fieldsMap = baseFieldsService.getLocaleFields(locale, messageSource);
			if("zh".equals(locale.getLanguage()))
				session.getServletContext().setAttribute("zh_fields", fieldsMap);
			else
				session.getServletContext().setAttribute("en_fields", fieldsMap);
			fieldsObj = fieldsMap;
		}
		session.setAttribute("sysFields", fieldsObj);
	}
}
