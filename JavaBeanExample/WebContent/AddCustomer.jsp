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
<title>Insert title here</title>
</head>
<body>
<c:set value="${requestScope.customerAdded}" var="result"></c:set>
<span style="color: green"><c:out value="${result}"></c:out></span>
	<div class="col-md-3">
		<form action="ProcessCustomer.jsp" method="post" class="form-group">
			<div>
				<label for="customerId">Customer Id: </label><input type="text"
					name="customerId" required="required" id="customerId"
					class="form-control" />
			</div>
			<div>
				<label for="customerName">Customer Name: </label><input type="text"
					name="customerName" required="required" id="customerName"
					class="form-control" />
			</div>
			<div>
				<label for="mobileNumber">Mobile Number:</label><input type="text"
					name="mobileNumber" required="required" id="mobileNumber"
					class="form-control" />
			</div>
			<div>
				<input type="submit" value="Add" class="btn btn-default" />
			</div>
		</form>
	</div>
</body>
</html>