package com.pack.ipem.dao;

import com.pack.ipem.bean.User;

public interface UserDao 
{
	boolean addUser(User user);
	void showAllUsers();
	boolean updateUser(User newuser);
	boolean deleteUser(int id);
	User findUserById(int id);
	User deleteUserByName(String name);
}
