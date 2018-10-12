<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/style.css" rel="stylesheet"
	type="text/css">
<title>Insert title here</title>
</head>
<body>

	<h2>Book Details</h2>
	<table>
		<tr>
			<td><c:out value="${command.bookNo}"></c:out></td>
		</tr>
		<tr>
			<td><c:out value="${command.bookName}"></c:out></td>
		</tr>
		<tr>
			<td><c:out value="${command.author}"></c:out></td>
		</tr>
		<tr>
			<td><c:out value="${command.category}"></c:out></td>
		</tr>
		<tr>
			<td><c:out value="${command.dateOfPublish}"></c:out></td>
		</tr>
		<tr>
			<td><c:out value="${command.ratePerUnit}"></c:out></td>
		</tr>
	</table>
</body>
</html>