package me.tspace.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.tspace.account.dao.UserDaoTest;
import me.tspace.account.model.UserTest;
import me.tspace.account.service.IUserServiceTest;


/**
 * 
 * @author dat mail:dev.tao@gmail.com
 *
 */

@Service
@Transactional
public class UserServiceImplTest implements IUserServiceTest {
	
	@Autowired
	private UserDaoTest userDao;

	@Override
	public UserTest read(int userID) {
		UserTest user = userDao.getUserByID(userID);
		return user;
	}

	@Override
	public UserTest read(String userName, String password) {
		UserTest user =userDao.getUserByName(userName);
		if(user!=null&&!password.equals(user.getPassword())){
			user = null;
		}
		return user;
	}

	@Override
	public UserTest register(UserTest user) {
		userDao.create(user);
		return userDao.getUserByName(user.getUserName());
	}
	
}
