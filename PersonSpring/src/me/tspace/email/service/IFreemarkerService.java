package me.tspace.email.service;

import javax.mail.MessagingException;  
  
import me.tspace.email.dto.MailSenderInfo;

public interface IFreemarkerService {  
  public void sendTemplate(MailSenderInfo  info) throws MessagingException;
}  