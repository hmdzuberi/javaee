<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<style type="text/css">
.plansContainer {
	position: relative;
	left: 10px;
	top: 60px;
}

.bold {
	font-weight: bold;
}

h2 {
	margin-left: 10px;
}
</style>

<title>Plans</title>
</head>
<%!String mobileNumber = "";%>
<%!String plan = "";%>
<%!String cost = "";%>
<%
	Cookie[] cookies = request.getCookies();

	for (Cookie cookie : cookies) {
		if (cookie.getName().equals("plan"))
			plan = cookie.getValue();
		if (cookie.getName().equals("mobileNumber"))
			mobileNumber = cookie.getValue();
	}

	if (plan.equals("Tera"))
		cost = "Rs. 499";
	else if (plan.equals("Giga"))
		cost = "Rs. 399";
	else if (plan.equals("Mega"))
		cost = "Rs. 299";
	else if (plan.equals("Kilo"))
		cost = "Rs. 199";
%>
<body>
	<div class="mainContainer">
		<div class="plansContainer">
			<h2>Plans</h2>
			<div class="tableContainer col-md-5">
				<table class="table">
					<tr>
						<td class="bold">Plans</td>
						<td class="bold">Tera</td>
						<td class="bold">Giga</td>
						<td class="bold">Mega</td>
						<td class="bold">Kilo</td>
					</tr>
					<tr>
						<td class="bold">Price</td>
						<td>499</td>
						<td>399</td>
						<td>299</td>
						<td>199</td>
					</tr>
					<tr>
						<td class="bold">Benefits</td>
						<td>90 days<br>Unlimited Calling<br>1.5GB a day
						</td>
						<td>82 days<br>Unlimited Calling<br>1GB a day
						</td>
						<td>70 days<br>Unlimited Calling<br>1GB a day
						</td>
						<td>28 days<br>Unlimited Calling<br>1GB a day
						</td>
					</tr>
				</table>
			</div>
		</div>
		<div class="rechargeContainer ">
			<h2>Recharge</h2>
			<div class="col-md-5">
				<form class="form-group" action="success.jsp">
					<div>
						<label for="mobileNumber">Mobile Number: </label> <input
							type="text" name="mobileNumber" class="form-control"
							value="<%=mobileNumber%>" />
					</div>
					<br>
					<div>
						<label for="plan">Plan: </label> <select name="plan"
							class="form-control">
							<option
								<%if (plan.equals("Tera"))
				out.println("selected");%>>Tera</option>
							<option
								<%if (plan.equals("Giga"))
				out.println("selected");%>>Giga</option>
							<option
								<%if (plan.equals("Mega"))
				out.println("selected");%>>Mega</option>
							<option
								<%if (plan.equals("Kilo"))
				out.println("selected");%>>Kilo</option>
						</select>
					</div>
					<br>
					<div>
						<label for="planCost">Cost: </label> <input type="text"
							name="planCost" class="form-control" value="" />
					</div>
					<br>
					<div>
						<input type="submit" value="Recharge" class="btn btn-default">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>