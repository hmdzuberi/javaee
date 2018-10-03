<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Processing Rating</title>
</head>
<body>
	<p>
		<span>Movie Name:</span>
		<c:out value="${param.movieName}" />
	</p>
	<p>
		<span>Rating:</span>
		<c:out value="${param.rating}" />
	</p>

</body>
</html>