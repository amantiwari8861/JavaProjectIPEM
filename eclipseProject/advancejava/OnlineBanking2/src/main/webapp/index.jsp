<%@page import="com.pack.ipem.bean.User"%>
<%@page import="java.util.List"%>
<%@page import="com.pack.ipem.dao.impl.UserDaoImpl"%>
<%@page import="com.pack.ipem.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <%@include file="cdns/allcsscdn.jsp" %>
  </head>
  <body>
   <%@include file="components/navbar.jsp" %>

<a href="adduser.jsp"> <button class="btn btn-danger" >+ Add user</button></a>

	<%
		UserDao dao=new UserDaoImpl();
		List<User> allusers= dao.getAllUsers();
	%>
	</br>
	</br>

	<table class="table table-striped table-hover"  border="2" width="100%">
		<thead>
		<tr>
		<th> ID </th>
		<th> Name </th>
		<th> Salary </th>
		<th> Phone No </th>
		<th> Actions</th>
		</tr>
		</thead>
		<tbody>
		
		<%
			for(User u:allusers)
			{
		%>
		<tr>
		<td> <%=u.getId() %> </td>
		<td> <%=u.getName() %> </td>
		<td> <%=u.getSalary() %> </td>
		<td> <%=u.getPhoneno() %> </td>
		<td> <a href="UpdateUser.jsp?id=<%=u.getId()%>">Edit</a>/ <a href="DeleteUser.jsp?id=<%=u.getId()%>">Delete</a> </td>
	</tr>
	<%} %>
	</tbody>	
	</table>


<%@include file="cdns/alljscdn.jsp" %>
  </body>
</html>