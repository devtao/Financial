package me.tspace.pm.service;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import me.tspace.pm.model.User;

/**
 * 
 * @author dat mail:dev.tao@gmail.com
 *
 */
public interface UserService {
	
	/**
	 * ����ID��ȡ�û�
	 * @param userID
	 * @return
	 */
	@Transactional(readOnly=true)
	public User read(int userID);

	/**
	 * ����username��password��ȡ�û�
	 * @param userName
	 * @param password
	 * @return
	 */
	@Transactional(readOnly=true)
	public User read(String userName, String password);
	
	@Transactional(readOnly=false,rollbackFor=DataAccessException.class)
	public User register(User user);
}
