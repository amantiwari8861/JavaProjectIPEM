package com.pack.ipem.dao;

import com.pack.ipem.bean.User;
import java.util.List;

public interface UserDao 
{
	boolean addUser(User user);
	List<User> getAllUsers();
	boolean updateUser(User newuser);
	boolean deleteUser(int id);
	User findUserById(int id);
	User deleteUserByName(String name);
}
