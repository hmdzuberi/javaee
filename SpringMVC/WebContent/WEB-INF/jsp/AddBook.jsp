<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	 crossorigin="anonymous">
	<title>AddBook</title>
</head>

<body>
	<div class="col-md-4">
		<form:form action="addBook" method="post" cssClass="form-group">
			<div>
				<label for="bookNo">Book No:</label>
				<form:input path="bookNo" cssClass="form-control" />
				<span>
					<form:errors cssStyle="color: red" path="bookNo"></form:errors>
				</span>
			</div>
			<br>
			<div>
				<label for="bookName">Book Name:</label>
				<form:input path="bookName" cssClass="form-control" />
			</div>
			<br>
			<div>
				<label for="author">Author:</label>
				<form:input path="author" cssClass="form-control" />
			</div>
			<br>
			<div>
				<label for="category">Category:</label>
				<form:select items="${catList}" path="category" cssClass="form-control"></form:select>
			</div>
			<br>
			<div>
				<label for="dateOfPublish">Date of Publish:</label>
				<form:input path="dateOfPublish" type="date" cssClass="form-control" />
				<br>
				<span>
					<form:errors cssStyle="color: red" path="dateOfPublish"></form:errors>
				</span>
			</div>
			<br>
			<div>
				<label for="ratePerUnit">Rate Per Unit:</label>
				<form:input path="ratePerUnit" cssClass="form-control" />
			</div>
			<br>
			<div>
				<input type="submit" value="Submit" class="btn btn-primary" style="margin: auto"/>
			</div>
		</form:form>
	</div>
</body>

</html>