package com.pack.ipem;

import com.pack.ipem.bean.User;
import com.pack.ipem.dao.UserDao;
import com.pack.ipem.dao.impl.UserDaoImpl;

public class Main {

	public static void main(String[] args) 
	{
		System.out.println("Hello world");
		
		UserDao dao=new UserDaoImpl();
		dao.addUser();
		
//		User u1=new User();
//		u1.setId(100);
//		u1.setName("Aman");
//		u1.setSalary(60000);

		User u1=new User(100, "Aman Tiwari", 70000);
		
//		System.out.println("User Id:"+u1.getId());
//		System.out.println("User Name:"+u1.getName());
//		System.out.println("User Salary:"+u1.getSalary());
		
		System.out.println(u1);
	}

}
