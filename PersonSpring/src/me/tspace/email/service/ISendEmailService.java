package me.tspace.email.service;

import javax.mail.MessagingException;

public interface ISendEmailService {
	
	public void sendEmail() throws MessagingException;
	
}
