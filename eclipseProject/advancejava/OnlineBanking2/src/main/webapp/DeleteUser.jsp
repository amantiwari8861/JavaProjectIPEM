<%@page import="com.pack.ipem.bean.User"%>
<%@page import="java.util.List"%>
<%@page import="com.pack.ipem.dao.impl.UserDaoImpl"%>
<%@page import="com.pack.ipem.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <%@include file="cdns/allcsscdn.jsp" %>

</head>
<body>

<%
	int id=Integer.parseInt(request.getParameter("id"));
	UserDao dao=new UserDaoImpl();
	boolean status=dao.deleteUser(id);
	response.sendRedirect("index.jsp");
// 	if(status)
// 	{
 %>
<!-- 	<div class="alert alert-success alert-dismissible fade show" role="alert"> -->
<!--   User <strong>deleted </strong> succesfully!!! -->
<!--   <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> -->
<!-- </div> -->
<%-- <%} --%>
<!-- // 	else -->
<!-- // 	{ -->
<%-- 	%> --%>
<!-- 		<div class="alert alert-success alert-dismissible fade show" role="alert"> -->
<!--   Unable to <strong>deleted </strong> user!!! -->
<!--   <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> -->
<!-- </div> -->
<%-- <%} %> --%>

<%@include file="cdns/alljscdn.jsp" %>

</body>
</html>