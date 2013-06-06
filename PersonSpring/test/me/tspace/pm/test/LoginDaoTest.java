package me.tspace.pm.test;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.tspace.pm.dao.LoginMapper;
import me.tspace.pm.model.Login;
import me.tspace.pm.service.LoginService;

public class LoginDaoTest extends AbstractTestCase{
	
	@Autowired
	LoginService loginService;
	
	@Test
	public void checkLoginExistsTest(){
		Login l = new Login();
		l.setLoginEmail("lilei@gmail.com");
		l.setLoginName("lilei");
		l.setLoginPwd("111111");
		Login login = loginService.checkLoginExists(l);
		Assert.assertNotNull(login);
	}
	
	@Test
	public void createLoginTest(){
		Login l = new Login();
		l.setLoginEmail("Lucy@gmail.com");
		l.setLoginLastdate(new Date());
		l.setLoginName("Lucy");
		l.setLoginPwd("111111");
		l = loginService.createLogin(l);
		System.out.println(l.getLoginName());
	}
	
}
