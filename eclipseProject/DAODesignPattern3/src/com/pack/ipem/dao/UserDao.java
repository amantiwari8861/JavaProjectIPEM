package com.pack.ipem.dao;

import com.pack.ipem.bean.User;

public interface UserDao 
{
	
	void addUser(User user);
	void showAllUsers();
	void updateUser(User newuser);
	void deleteUser(int id);
	User findUserById(int id);
	void deleteUserByName(String name);
	
}
