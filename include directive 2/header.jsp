<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="firstjsp.Demo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome here:</h1>
<%
String uname = request.getParameter("usernme");
Demo u = new Demo();
u.setName(uname);
session.setAttribute("name", u.getName());

%>
<%= u.getName() %>
</body>
</html>