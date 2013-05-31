package me.tspace.pm.controller;

import java.text.SimpleDateFormat;

import me.tspace.pm.model.TLogin;
import me.tspace.pm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="login.do" ,method=RequestMethod.GET)
	public String initForm(ModelMap map){
		TLogin login = new TLogin();
		map.addAttribute("login", login);
		return  "app/common/login";
	}
	
	@RequestMapping(value="login.do",method=RequestMethod.POST)
	public String submit(ModelMap map){
		
		int userID=1;
		return "redirect:profile.do?userID="+userID;
	}
	
}
