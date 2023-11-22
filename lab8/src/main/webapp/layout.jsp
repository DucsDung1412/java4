<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<% 
		String lang = ""+session.getAttribute("lang");
		String s = session.getAttribute("mess") != null ? ""+session.getAttribute("mess") : "index";
	%>
	<fmt:setLocale value="<%= lang %>" scope="request"/>
	<fmt:setBundle basename="home" scope="request"/>
	<%
		if(s.equals("index")){
	%>
		<h1> <fmt:message key="index.title"/> </h1>
	<%
		} else if(s.equals("about")){
	%>
		<h1> <fmt:message key="about.title"/> </h1>
	<%
		} else if(s.equals("contact")){
	%>
		<h1> <fmt:message key="contact.title"/> </h1>
	<%
		}
	%>
	</body>
</html>