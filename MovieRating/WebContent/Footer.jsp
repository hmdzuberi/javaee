<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<c:out value="Designed by Abc Software Pvt. Ltd."></c:out>

	<%=application.getInitParameter("cright")%>

	<c:set var="copyright" value="${param.cright}" scope="application" />
	<c:out value="${copyright}"></c:out>
</body>
</html>