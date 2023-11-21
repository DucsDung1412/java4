<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<% int count = Integer.valueOf(request.getAttribute("count").toString()); %>
	<h1><%= count %></h1>
	</body>
</html>