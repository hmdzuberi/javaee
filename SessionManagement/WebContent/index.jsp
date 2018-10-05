<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Session Management</title>
</head>
<body>
<% session.setMaxInactiveInterval(2 * 60); %>
<% session.setAttribute("name", "Ram"); %>
<a href="DemoServlet">Session Management</a>
</body>
</html>