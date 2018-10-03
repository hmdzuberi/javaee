<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Your cart</h4>
	<ul>
		<li>
			<%
				out.print(session.getAttribute("book"));
			%>
		</li>
		<li>
			<%
				out.print(session.getAttribute("mobile"));
			%>
		</li>
		<li>
			<%
				String[] coupons = (String[]) session.getAttribute("coupons");
				for (String coupon : coupons) {
					out.print(coupon);
				}
			%>
		
	</ul>
</body>
</html>