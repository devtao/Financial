package me.tspace.pm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.tspace.pm.dao.UserDao;
import me.tspace.pm.model.User;
import me.tspace.pm.service.UserService;


/**
 * 
 * @author dat mail:dev.tao@gmail.com
 *
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User read(int userID) {
		User user = userDao.getUserByID(userID);
		return user;
	}

	@Override
	public User read(String userName, String password) {
		User user =userDao.getUserByName(userName);
		if(user!=null&&!password.equals(user.getPassword())){
			user = null;
		}
		return user;
	}

	@Override
	public User register(User user) {
		userDao.create(user);
		return userDao.getUserByName(user.getUserName());
	}
	
}
