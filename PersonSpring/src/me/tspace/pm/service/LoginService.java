package me.tspace.pm.service;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import me.tspace.pm.model.Login;
/**
 * 
 * @author dat mail:dev.tao@gmail.com
 *
 */
public interface LoginService {
		/**
		 * 检查用户名或邮箱是否存在
		 * @param login
		 * @return
		 */
		@Transactional(readOnly=true)
		public boolean checkLoginExists(Login login);
		
		/**
		 * 注册新用户,同时创建user
		 * @param login
		 * @return
		 */
		@Transactional(readOnly=false,rollbackFor=DataAccessException.class)
		public Login createLogin(Login login);
		
}
