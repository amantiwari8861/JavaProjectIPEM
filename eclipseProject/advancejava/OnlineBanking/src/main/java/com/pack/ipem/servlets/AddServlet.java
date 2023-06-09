package com.pack.ipem.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.ipem.bean.User;
import com.pack.ipem.dao.UserDao;
import com.pack.ipem.dao.impl.UserDaoImpl;


@WebServlet("/addUser")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Hello in servlet");
	
		int id = Integer.parseInt(request.getParameter("id"));
		String uname = request.getParameter("uname");
		double salary = Double.parseDouble(request.getParameter("salary"));
		long phone = Long.parseLong(request.getParameter("phone"));
	
	User user=new User(id, uname, salary, phone);
	UserDao dao=new UserDaoImpl();
	boolean status = dao.addUser(user);
	
	if(status)
	{
		response.getWriter().append("<br>added user succesfully !");
	}
	else
	{
		response.getWriter().append("<br>unable to add user !");

	}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
