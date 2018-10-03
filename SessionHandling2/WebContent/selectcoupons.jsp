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
<title>Mini Shopping Cart</title>
</head>
<body>
	<div>
		<h4>Your cart</h4>
		<div>
			<%
				
			%>
		</div>
	</div>
	<br>
	<div>
		<form class="form-group" action="cart">
			<div>
				<label><input type="checkbox" name="coupons" value="Dominos">Dominos</label>
			</div>
			<div>
				<label><input type="checkbox" name="coupons" value="Pizza Hut">Pizza Hut</label>
			</div>
			<div>
				<label><input type="checkbox" name="coupons" value="BookMyShow">BookMyShow</label>
			</div>
			<input type="submit" value="Add to cart">
		</form>
	</div>
</body>
</html>