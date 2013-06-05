package me.tspace.pm.test;

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
		boolean flag = loginService.checkLoginExists(l);
		Assert.assertTrue(flag);
	}
}
