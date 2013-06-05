package me.tspace.pm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import me.tspace.pm.model.UserTest;


/**
 * 
 * @author dat mail:dev.tao@gmail.com
 *
 */
@Repository
public interface UserDaoTest {
	public UserTest getUserByName(String userName);
	public UserTest getUserByID(int userID);
	public void create(UserTest user);
	public List<UserTest> getAllUsers();
	public void deleteUser(UserTest user);
	public void updateUser(UserTest user);
}
