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
<title>Insert title here</title>
</head>
<body>
	<div class="col-md-3">
		<form class="form" action="ProcessRating.jsp">
			<div class="form-group">
				<label for="">Movie name: </label> <input type="text"
					name="movieName" class="form-control">
			</div>
			<div class="form-group">
				<label for="">Rating: </label> <input type="number" name="rating"
					max="5" min="1" step=".5" class="form-control" />
			</div>
			<div class="form-group">
				<input type="submit" name="submit" class="btn btn-success">
			</div>
		</form>
	</div>
</body>
</html>