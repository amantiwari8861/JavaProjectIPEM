package com.pack.ipem.dao;

import com.pack.ipem.bean.User;

public interface UserDao {

	void addUser();
	void listAllUsers();
	void updateUser();
	void deleteUser();
	User findUserById(int id);
	
}
