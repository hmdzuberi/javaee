<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wonders of the World</title>
</head>
<body>
	<div>
		<table>
			<tr>
				<th>Wonder Name:</th>
				<td>${command.wonderName}</td>
			</tr>
			<tr>
				<th>Image:</th>
				<td><img alt="" src="resources/images/${command.imageLoc}"></td>
			</tr>
			<tr>
				<th>Description:</th>
				<td>${command.description}</td>
			</tr>
			<tr>
				<th>Continent:</th>
				<td>${command.continent}</td>
			</tr>
			<tr>
				<th>Category:</th>
				<td>${command.category}</td>
			</tr>
		</table>
	</div>
</body>
</html>