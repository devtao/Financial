package me.tspace.account.service;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import me.tspace.account.model.UserTest;

/**
 * 
 * @author dat mail:dev.tao@gmail.com
 *
 */
public interface IUserServiceTest {
	
	/**
	 * @param userID
	 * @returns
	 */
	@Transactional(readOnly=true)
	public UserTest read(int userID);

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	@Transactional(readOnly=true)
	public UserTest read(String userName, String password);
	
	@Transactional(readOnly=false,rollbackFor=DataAccessException.class)
	public UserTest register(UserTest user);
}
