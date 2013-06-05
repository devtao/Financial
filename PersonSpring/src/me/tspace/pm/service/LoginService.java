package me.tspace.pm.service;

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
		public boolean checkLoginExists(Login login);
		
		/**
		 * 注册新用户
		 * @param login
		 * @return
		 */
		public Login createLogin(Login login);
		
		/**
		 * 查询用户是否存在
		 * @param name
		 * @return
		 */
		public boolean checkExistWithName(String name);
		
		/**
		 * 查询Email是否存在
		 * @param email
		 * @return
		 */
		public boolean checkExistWithEmail(String email);
		
}
