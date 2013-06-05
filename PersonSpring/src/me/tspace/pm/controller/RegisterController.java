package me.tspace.pm.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import me.tspace.pm.model.UserTest;
import me.tspace.pm.service.UserServiceTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {
	
	@Autowired
	private UserServiceTest userService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
		binder.registerCustomEditor(Date.class, "birthday",new CustomDateEditor(format, true));
	}
	
	@RequestMapping(value="register.do", method=RequestMethod.GET)
	public String initForm(ModelMap model){
		UserTest user = new UserTest();
		model.addAttribute("user",user);
		return "app/common/register"; 
	}
	
	@RequestMapping(value="register.do",method=RequestMethod.POST)
	public String submit(@ModelAttribute("user") UserTest user){
		int userID = userService.register(user).getUserID();
		return "redirect:profile.do?userID="+userID;
		
	}
	
}
