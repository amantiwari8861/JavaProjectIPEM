package com.pack.ipem;

import java.sql.Connection;
import java.sql.SQLException;

import com.pack.ipem.bean.User;
import com.pack.ipem.dao.UserDao;
import com.pack.ipem.dao.impl.UserDaoImpl;
import com.pack.ipem.util.ConnectionProvider;

public class MainFile {

	public static void main(String[] args) {
		
		User u1=new User(100, "Aman Tiwari", 50000, 9891062743L);
		
//		System.out.println(u1);
		
		UserDao dao=new UserDaoImpl();
		dao.addUser(u1);
		dao.addUser(new User(101,"raj",50000,6446565l));
		dao.addUser(new User(102,"nidhi",50000,6446565l));
		dao.addUser(new User(103,"vikash",50000,6446565l));
		
//		dao.showAllUsers();
//		System.out.println("-------------------------------");
//		dao.updateUser(new User(102,"Tanu ",51000,687877L));
//		dao.showAllUsers();
//		System.out.println("-------------------------------");
//		dao.updateUser(new User(108,"Tanu ",51000,687877L));
//		dao.showAllUsers();
//		
//		dao.deleteUser(101);
//		System.out.println("-------------------------------");
//		dao.showAllUsers();

		
//		User foundUser = dao.findUserById(103);
//		if (foundUser == null) 
//		{
//			System.out.println("User Not Found");
//		}
//		else
//		{
//			System.out.println(foundUser);
//		}
//		
//		User foundUser2 = dao.findUserById(109);
//		if (foundUser2 == null) {
//			System.out.println("User Not Found");
//		}
//		else
//		{
//			System.out.println(foundUser2);
//		}
		
		Connection connection = ConnectionProvider.getConnection();
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
