<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<title>Wonders of the World</title>
</head>
<body>
	<div class="col-md-4">
		<form:form action="addWonder" method="post" cssClass="form-group">
			<div>
				<label for="wonderName">Wonder Name:</label>
				<form:input path="wonderName" cssClass="form-control" />
			</div>
			<br>
			<div>
				<label for="imageLoc">Image Location:</label>
				<form:input path="imageLoc" cssClass="form-control" />
			</div>
			<br>
			<div>
				<label for="description">Description:</label>
				<form:input path="description" cssClass="form-control" />
			</div>
			<br>
			<div>
				<label for="continent">Continent</label>
				<form:select items="${continentList}" path="continent"
					cssClass="form-control" />
			</div>
			<br>
			<div>
				<label for="category">Category</label>
				<div>
					<form:radiobuttons items="${categoryList}" path="category" />
				</div>

			</div>
			<br>
			<div>
				<input type="submit" value="Submit" class="btn btn-primary" />
			</div>
		</form:form>
	</div>
</body>
</html>