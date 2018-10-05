<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<title>Success</title>
</head>
<%
	String mobileNumber = request.getParameter("mobileNumber");
	String plan = request.getParameter("plan");

	Cookie cookieMobileNumber = new Cookie("mobileNumber", mobileNumber);
	Cookie cookiePlan = new Cookie("plan", plan);

	response.addCookie(cookieMobileNumber);
	response.addCookie(cookiePlan);
%>
<body>
	<h3>Recharged!</h3>
	<br>
	<a href="index.jsp">Go back</a>
</body>
</html>