package me.tspace.account.controller.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;


public class LoginControllerTest {
	@Test
	public void testSimpleFormate(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		String date = dateFormat.format(now);
		System.out.println(date);
	}
	
	
}
