package me.tspace.pm.controller;

import me.tspace.pm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	
}
