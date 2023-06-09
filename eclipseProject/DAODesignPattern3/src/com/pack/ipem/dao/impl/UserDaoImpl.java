package com.pack.ipem.dao.impl;

import java.util.ArrayList;
import com.pack.ipem.bean.User;
import com.pack.ipem.dao.UserDao;

public class UserDaoImpl implements UserDao
{
	private ArrayList<User> usersList=new ArrayList<>();
	@Override
	public void addUser(User user) 
	{
		usersList.add(user);
		System.out.println("User Added Succesfully!!");
	}
	@Override
	public void showAllUsers()
	{
		for(int i=0;i<usersList.size();i++)
		{
			User user = usersList.get(i);
			System.out.println(user);
		}
	}
	@Override
	public void updateUser(User newuser) 
	{
		boolean found=false;
		for(int i=0;i<usersList.size();i++)
		{
			User user = usersList.get(i);
			if(user.getId()==newuser.getId())
			{
				usersList.set(i, newuser);
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Not found in List!!");
		}
	}
	@Override
	public void deleteUser(int id) 
	{
		boolean found=false;
//		usersList.removeIf((user)->user.getId()==id);
		for (int i = 0; i < usersList.size(); i++) 
		{
			User user = usersList.get(i);
			if(user.getId()==id)
			{
				usersList.remove(i);
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Not found in List!!");
		}
		
	}
	@Override
	public User findUserById(int id) 
	{
		boolean found=false;
//		usersList.removeIf((user)->user.getId()==id);
		for (int i = 0; i < usersList.size(); i++) 
		{
			User user = usersList.get(i);
			if(user.getId()==id)
			{
//				System.out.println("Found :"+user);
				found=true;
				return user;
			}
		}
		if(!found)
		{
			System.out.println("Not found in List!!");
		}
		return null;
	}
	@Override
	public void deleteUserByName(String name) {
		// TODO Auto-generated method stub
		
	}

}
