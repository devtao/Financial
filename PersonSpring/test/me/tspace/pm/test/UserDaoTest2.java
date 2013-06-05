package me.tspace.pm.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import me.tspace.pm.model.UserTest;
import me.tspace.pm.dao.UserDaoTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class UserDaoTest2 extends AbstractTestCase {
	
	@Autowired
	UserDaoTest userDao;
	
	@Test
	public void createTest(){
		UserTest user = new UserTest();
		user.setUserName("a@gmail.com");
		user.setBirthday(new Date());
		user.setRealName("testname");
		user.setLevel(1);
		user.setPhoneNum("15890934872");
		user.setPassword("111111");
		
		userDao.create(user);
		UserTest u = userDao.getUserByName("a@gmail.com");
		
		assertNotNull(u);
	}
	
	@Test
	public void getUserByID(){
		UserTest user = userDao.getUserByID(1);
		System.out.println(user.getUserName());
		assertNotNull(user);
	}
	
	@Test
	public void getUserByNameTest(){
		UserTest user = userDao.getUserByName("lilei@gmail.com");
		System.out.println(user.getRealName());
		assertNotNull(user);
	}
	
	@Test
	public void getAllUserTest(){
		List<UserTest> users = userDao.getAllUsers();
		for(UserTest u:users){
			System.out.println(u.getUserName()+" pwd: "+u.getPassword()+" realName: "+u.getRealName());
		}
	}
	
	//test github
	@Test
	public void test(){}
	
	
}
