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
		session.setAttribute("secondAttribute", "I visited Second.jsp");
	%></span>
	<p>
		<%
			out.println(session.getId());
		%>
	</p>
	<a href="Third.jsp">Next</a>
</body>
</html>