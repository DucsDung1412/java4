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
		String error = String.valueOf(session.getAttribute("error"));
		String ss = String.valueOf(session.getAttribute("error1"));
		if(ss != null){
	%>
			<h1><%= ss %></h1>
	<%
		} else {
	%>
			<h1>vljd</h1>
	<%
		}
	%>
	<h1><%= error %></h1>
	
	</body>
</html>