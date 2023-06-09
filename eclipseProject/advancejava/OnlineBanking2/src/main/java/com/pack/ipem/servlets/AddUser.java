package com.pack.ipem.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.ipem.bean.User;
import com.pack.ipem.dao.UserDao;
import com.pack.ipem.dao.impl.UserDaoImpl;

@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		double salary = Double.parseDouble(request.getParameter("salary"));
		long phone = Long.parseLong(request.getParameter("phone"));
	
		User user=new User(id, name, salary, phone);
		UserDao dao=new UserDaoImpl();
		boolean status = dao.addUser(user);
		
		PrintWriter out = response.getWriter();
		if(status)
		{
			out.print(" <div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\">\r\n"
					+ "  User <strong>Added </strong> succesfully!!!\r\n"
					+ "  <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\r\n"
					+ "</div>  ");
			
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
		else
		{
			out.print(" <div class=\"alert alert-danger alert-dismissible fade show\" role=\"alert\">\r\n"
					+ "  unable to <strong>Add </strong> User!!!\r\n"
					+ "  <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\r\n"
					+ "</div>  ");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
		
	}

}
