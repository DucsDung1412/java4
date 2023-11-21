<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<% 
		String mess = request.getAttribute("mess") == null ? "" : String.valueOf(request.getAttribute("mess"));
	%>
		<form action="tinh-tam-giac" method="get">
			<input type="number" name="a" placeholder="canh a?">
			<input type="number" name="b" placeholder="canh b?">
			<input type="number" name="c" placeholder="canh c?">
			<hr>
			<button type="submit" name="dienTich">Tinh Dien Tich</button>
			<button type="submit" name="chuVi">Tinh Chu Vi</button>
			<h1><%= mess %></h1>
		</form>
	</body>
</html>