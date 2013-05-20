package me.tspace.pm.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.tspace.pm.dao.UserDao;
import me.tspace.pm.model.User;

public class UserDaoTest extends AbstractTestCase {
	@Autowired
	UserDao userDao ;
	
	@Test
	public void createTest(){
		User user = new User();
		user.setUserName("a@gmail.com");
		user.setBirthday(new Date());
		user.setRealName("testname");
		user.setLevel(1);
		user.setPhoneNum("15890934872");
		user.setPassword("111111");
		
		userDao.create(user);
		User u = userDao.getUserByName("a@gmail.com");
		
		assertNotNull(u);
	}
	
	@Test
	public void getUserByID(){
		User user = userDao.getUserByID(1);
		System.out.println(user.getUserName());
		assertNotNull(user);
	}
	
	@Test
	public void getUserByNameTest(){
		User user = userDao.getUserByName("lilei@gmail.com");
		System.out.println(user.getRealName());
		assertNotNull(user);
	}
	
	@Test
	public void getAllUserTest(){
		List<User> users = userDao.getAllUsers();
		for(User u:users){
			System.out.println(u.getUserName()+" pwd: "+u.getPassword()+" realName: "+u.getRealName());
		}
	}
	
	//test github
	@Test
	public void test(){}
	
	
}
