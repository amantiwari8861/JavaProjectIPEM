package com.pack.ipem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider 
{
	private static Connection con=null;
	
	public static Connection getConnection()
	{
		String url="jdbc:mysql://localhost:3306/";
		String db="ipem";
		String username="root";
		String password="1234";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url+db,username,password);
			System.out.println("Connection Succesfull!!");
		}
		catch(ClassNotFoundException cf)
		{
			System.out.println("pls load driver");
//			cf.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return con;
	}
}
