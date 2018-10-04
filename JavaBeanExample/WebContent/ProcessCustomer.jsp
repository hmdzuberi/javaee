<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="customerBean" scope="session"
		class="com.training.beans.Customer"></jsp:useBean>
	<jsp:setProperty property="*" name="customerBean" />
	<!--
	<c:set var="result" value="${customerBean.toString()}"></c:set>
	<c:out value="${result}"></c:out>
	-->
	<jsp:forward page="customerServlet"></jsp:forward>
</body>
</html>