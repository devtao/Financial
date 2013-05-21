package me.tspace.pm.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import me.tspace.pm.model.User;


/**
 * 
 * @author dat mail:dev.tao@gmail.com
 *
 */
@Repository
public interface UserDao {
	public User getUserByName(String userName);
	public User getUserByID(int userID);
	public void create(User user);
	public List<User> getAllUsers();
	public void deleteUser(User user);
	public void updateUser(User user);
}
