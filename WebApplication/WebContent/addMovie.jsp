<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Movies</title>
</head>
<body>
<h2>Add Movies</h2>
	<form action="addmovies" method="get">
		<table>
			<tr>
				<td><label for="movieID">Movie ID: </label></td>
				<td><input type="text" name="movieID" id="movieID"></td>
			</tr>
			<tr>
				<td><label for="movieName">Movie: </label></td>
				<td><input type="text" name="movieName" id="movieName"></td>
			</tr>
			<tr>
				<td><label for="director">Director: </label></td>
				<td><input type="text" name="director" id="director"></td>
			</tr>
			<tr>
				<td><label for="genre">Genre: </label></td>
				<td><input type="text" name="genre" id="genre"></td>
			</tr>
			<tr>
				<td><label for="rating">Rating: </label></td>
				<td><input type="number" name="rating" id="rating"></td>
			</tr>
			<tr style="text-align: center">
				<td colspan=2><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>