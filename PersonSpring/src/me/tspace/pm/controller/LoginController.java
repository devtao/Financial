package me.tspace.pm.controller;

import me.tspace.pm.model.Login;
import me.tspace.pm.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="login.do",method=RequestMethod.GET)
	public String initForm(ModelMap model){
		Login login = new Login();
		model.addAttribute("login",login);
		return "loginAndregister";
	}
	
	@RequestMapping(value = "login.do" ,method = RequestMethod.POST)
	public String submit(@ModelAttribute("login") Login login){
		Login loginin = loginService.checkLoginExists(login);
		if(loginin!=null){
			return "redirect:profile.do?userID="+loginin.getLoginId();
		}else{
			return "redirect:login.do";
		}
	}
	
	
}
