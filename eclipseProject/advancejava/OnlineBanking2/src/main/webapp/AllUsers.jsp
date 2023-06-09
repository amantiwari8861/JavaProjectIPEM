<%@page import="com.pack.ipem.bean.User"%>
<%@page import="java.util.List"%>
<%@page import="com.pack.ipem.dao.impl.UserDaoImpl"%>
<%@page import="com.pack.ipem.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">Navbar</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Dropdown
                </a>
                <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="#">Action</a></li>
                  <li><a class="dropdown-item" href="#">Another action</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li>
              <li class="nav-item">
                <a class="nav-link disabled">Disabled</a>
              </li>
            </ul>
            <form class="d-flex" role="search">
              <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
          </div>
        </div>
      </nav>


<a href="adduser.jsp"> <button class="btn btn-success" >+ Add user</button></a>

	<%
		UserDao dao=new UserDaoImpl();
		List<User> allusers= dao.getAllUsers();
	%>
	</br>
	</br>

	<table class="table table-striped"  border="2" width="100%">
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