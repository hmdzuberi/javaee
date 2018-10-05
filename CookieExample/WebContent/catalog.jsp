<%@page import="com.training.servlets.ItemList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.*, java.util.stream.*, com.training.servlets.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Catalog</title>
</head>
<%!String bgColor;%>
<body style="background-color: <%=bgColor%>">
	<%
		Cookie[] cookies = request.getCookies();
		List<Cookie> cookieList = Arrays.asList(cookies);

		List<String> cookieNames = cookieList.stream().filter(
				cookie -> cookie.getName().equals("searchedItem") || cookie.getName().equals("selectedColor"))
				.map(Cookie::getValue).collect(Collectors.toList());

		List<String> items = ItemList.getItems().get(cookieNames.get(0));

		if (cookieNames.size() > 1)
			bgColor = cookieNames.get(1);

		out.println("Your last viewed following items: ");

		for (String eachItem : items)
			out.println(eachItem);
	%>
	<ul>
		<li>Books</li>
		<li>Textiles</li>
		<li>Fashion</li>
		<li>Sweets</li>
	</ul>
</body>
</html>