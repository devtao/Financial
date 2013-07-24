package me.tspace.email.controller;

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
	public String submit() throws MessagingException{
		sendEmailService.sendEmail();
		return "reg";
	}
	
}
