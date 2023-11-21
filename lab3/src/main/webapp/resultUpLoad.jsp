<%@page import="java.nio.file.Files"%>
<%@page import="java.io.File"%>
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
		String img = String.valueOf(request.getAttribute("img"));
		String doc = String.valueOf(request.getAttribute("doc"));
	%>
		<h2>1. Hình: <%= img %></h2>
		<img src="<%= img %>" height="100">
		
		<h2>2. Tài liệu: <%= doc %></h2>
		<a href="<%= doc %>">Tải về</a>
	</body>
</html>