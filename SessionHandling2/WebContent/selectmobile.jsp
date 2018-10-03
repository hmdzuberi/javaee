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
	<div class="col-lg-3">
		<form class="form-group" action="cart">
			<div>
				<input type="radio" value="iPhone" name="mobileName">iPhone</label>
			</div>
			<div>
				<input type="radio" value="Samsung" name="mobileName">Samsung</label>
			</div>
			<div>
				<input type="radio" value="OnePlus" name="mobileName">OnePlus</label>
			</div>
			<input class="btn" type="submit" value="Add to cart">
		</form>
	</div>
</body>
</html>