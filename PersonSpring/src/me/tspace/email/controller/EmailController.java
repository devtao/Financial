package me.tspace.email.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import me.tspace.email.dto.MailSenderInfo;
import me.tspace.email.service.IFreemarkerService;
import me.tspace.email.service.ISendEmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author dat mail:dev.tao@gmail.com
 *
 */

@Controller
public class EmailController {
	@Autowired
	private ISendEmailService sendEmailService;
	
	@RequestMapping(value="sendEmail.do",method=RequestMethod.GET)
	public String initLogin(ModelMap model){
		return "email/email";
	}
	
	@RequestMapping(value="sendEmail.do",method=RequestMethod.POST)
	public String submit(ModelMap model) throws MessagingException{
		sendEmailService.sendEmail();
		model.addAttribute("logo", "http://file.selleckchem.com/images/logo.gif");
		model.addAttribute("banner", "http://www.selleckchem.com/newsletter-fodder/lib-gpcr-banner.png");
		List<String> content = new ArrayList<String>();
		content.add("content1..........................................");
		content.add("content2..........................................");
		content.add("content4..........................................");
		content.add("content3..........................................");
		model.addObject("contents", content);
		return "mail";
	}
	
}
