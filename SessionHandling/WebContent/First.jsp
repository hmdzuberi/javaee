<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<span style="color: red">New Session <%
		out.println(session.isNew());
	%></span>
	<p>
	<%
		out.println(session.getId());
	%>
	</p>
	<a href="Second.jsp">Next</a>
</body>
</html>