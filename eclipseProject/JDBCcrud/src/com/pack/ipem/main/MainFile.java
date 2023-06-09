package com.pack.ipem.main;

import java.sql.Connection;
import java.util.Scanner;

import com.pack.ipem.bean.User;
import com.pack.ipem.dao.UserDao;
import com.pack.ipem.dao.impl.UserDaoImpl;

public class MainFile 
{
	private Scanner sc=null;
	public MainFile() 
	{
		sc=new Scanner(System.in);
	}
	public User getUserDetails()
	{		
		User user=new User();
		System.out.println("Enter User Id:");
		user.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter User Name:");
		user.setName(sc.nextLine());
		System.out.println("Enter User Salary:");
		user.setSalary(sc.nextDouble());
		System.out.println("Enter Phone No:");
		user.setPhoneno(sc.nextLong());
		return user;
	}

	public static void main(String[] args) {
		
//		User u1=new User(102, "Aman Tiwari", 70000, 9891062743L);
//		 UserDao dao=new UserDaoImpl();
//		 boolean status = dao.addUser(u1);
//		 if (status)
//		 {
//			 System.out.println("Added Succesfully!!");
//		 }
//		 else
//		 {
//			 System.out.println("Unable to add user");
//		 }
//		 dao.showAllUsers();
		 
//		 boolean isUpdated = dao.updateUser(new User(101,"Pushpendra",30000,9899888L));
//		 if(isUpdated)
//		 {
//			 System.out.println("updated succesfully");
//		 }
//		 else
//		 {
//			 System.out.println("update unsuccesfull");
//		 }
//		 
//		 dao.showAllUsers();
//		 dao.deleteUser(1);
//		 dao.deleteUser(2);
//		 dao.deleteUser(500);
//		  boolean status = dao.deleteUser(50991);
//		 if(status)
//		 {
//			 System.out.println("Deleted succesfully");
//		 }
//		 else
//		 {
//			 System.out.println("Unable to delete");
//		 }
//		 dao.showAllUsers();
		MainFile main=new MainFile();

		do
		{
			System.out.println("1.Add user");
			System.out.println("2.Delete user");
			System.out.println("3.Update user");
			System.out.println("4.Show all users");
			System.out.println("5.Find user by Id");
			System.out.println("6.Delete user by name");
			System.out.println("7.Get Users by salary");
			System.out.println("8.Exit");
			System.out.println("Enter the Choice");
			
			int choice=main.sc.nextInt();
			UserDao dao=new UserDaoImpl();
			switch (choice) 
			{
			case 1:
				dao.addUser(main.getUserDetails());
				break;
			case 2:
				System.out.println("User id to be deleted:");
				boolean status = dao.deleteUser(main.sc.nextInt());
				if(status)
					System.out.println("User deleted succesfully!");
				else
					System.out.println("unable to delete user!");
				break;
			case 3:
				System.out.println("Enter New data");
				dao.updateUser(main.getUserDetails());
				break;
			case 4:
				dao.showAllUsers();
				break;
			case 5:
				System.out.println("User id to find:");
				User user = dao.findUserById(main.sc.nextInt());
				System.out.println(user);
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				System.exit(0);
				break;
				default:System.out.println("Invalid Choice!!");
					break;
			}
		}while(true);

	}
}