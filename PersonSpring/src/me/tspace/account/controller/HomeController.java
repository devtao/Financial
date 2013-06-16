package me.tspace.account.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping(value="home.do",method=RequestMethod.GET)
	public String home(@RequestParam("userID") int userID,ModelMap model){
		logger.info("哈哈哈"+userID);
		return "home";
	}
	
	
}
