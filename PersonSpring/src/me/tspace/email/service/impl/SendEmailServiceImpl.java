package me.tspace.email.service.impl;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.tspace.email.dto.MailSenderInfo;
import me.tspace.email.service.IFreemarkerService;
import me.tspace.email.service.ISendEmailService;

@Service
public class SendEmailServiceImpl implements ISendEmailService {
	@Autowired
	private IFreemarkerService fs ;
	
	@Override
	public void sendEmail() throws MessagingException {
		
		   MailSenderInfo mailInfo = new MailSenderInfo();  
	        // 这个类主要是设置邮件  
	        mailInfo.setMailServerHost("smtp.qq.com");// 服务器地址  
	        mailInfo.setMailServerPort("25");// 端口  
	        mailInfo.setValidate(true); // 是否验证，这个地方是必须的  
	        mailInfo.setFromAddress("240160085@qq.com");// 这个是你的邮箱  ,在程序发送一方需对应,就是你在配置文件的发送邮箱的名称  
	        mailInfo.setToAddress("dev.tao@gmail.com");// 目的地  
	        mailInfo.setSubject("这是一封模板邮件");  
	        mailInfo.setContent("模板邮件测试内容");  
	        fs.sendTemplate(mailInfo);  
	        System.out.println("模板邮件发送完毕");  
	}
	
}
