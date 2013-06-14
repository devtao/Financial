package me.tspace.account.service;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import me.tspace.account.model.Login;
import me.tspace.account.model.User;
/**
 * 
 * @author dat mail:dev.tao@gmail.com
 *
 */
public interface IUserService {
		
		/**
		 * 创建用户
		 * @param user
		 * @return
		 */
		@Transactional(readOnly=false,rollbackFor=DataAccessException.class)
		public User createCreate(Login login);
		
		/**
		 * 检查用户名是否存在
		 * @param name
		 * @return
		 */
		@Transactional(readOnly=true)
		public boolean checkNameExists(String name);
		
		/**
		 * 检查邮箱是否存在
		 * @param email
		 * @return
		 */
		@Transactional(readOnly=true)
		public boolean checkEmailExists(String email);
		
		
}
