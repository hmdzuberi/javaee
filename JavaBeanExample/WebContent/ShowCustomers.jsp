<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<title>Customers</title>
</head>
<body>
	<h3>Customer List</h3>
	<div class="col-md-6">
		<table class="table table-bordered table-hover">
			<tr>
				<td>Customer ID</td>
				<td>Customer Name</td>
				<td>Mobile Number</td>
			</tr>
			<c:forEach items="${requestScope.customerList}" var="customer">
				<tr>
					<td><c:out value="${customer.getCustomerId()}"></c:out></td>
					<td><c:out value="${customer.getCustomerName()}"></c:out></td>
					<td><c:out value="${customer.getMobileNumber()}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>