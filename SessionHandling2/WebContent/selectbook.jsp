<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<title>Mini Shopping Card</title>
</head>
<body>
	<div>
		<h4>Your cart</h4>
		<div>
			<% 
				
			%>
		</div>
	</div>
	<div class="col-lg-3">
		<form class="form-group" action="cart">
			<label for="book">Book: </label> <select class="form-control"
				id="bookName" name="bookName">
				<option>Head First Java</option>
				<option>Head First Servlets and JSP</option>
				<option>Thinking in Java</option>
			</select> <br> <input class="btn" type="submit" value="Add to cart">
		</form>
	</div>
</body>
</html>