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
	<p style="color: gold">
		<%
			out.println(session.getAttribute("firstAttribute"));
			out.println(session.getAttribute("secondAttribute"));
		%>
	</p>
	<%
		session.invalidate();
	%>
	<a href="Four.jsp">Next</a>
</body>
</html>