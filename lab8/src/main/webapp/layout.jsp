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
	<%-- <% 
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
	%> --%>
	<%
		String s = session.getAttribute("mess") != null ? ""+session.getAttribute("mess") : "home";
		if(s.equals("home")){
	%>
			<h1> Home </h1>
	<%
		} else if(s.equals("about")){
	%>
			<h1> About Us </h1>
	<%
		} else if(s.equals("contact")){
	%>
			<h1> Contact Us </h1>
	<%
		} else if(s.equals("faq")){
	%>
			<h1> FAQ </h1>
	<%	
		} else if(s.equals("signin")){
	%>
			<h1> signin </h1>
	<%		
		} else if(s.equals("signup")){
	%>
			<h1> signup </h1>
	<%		
		} else if(s.equals("signout")){
	%>
			<h1> signout </h1>
	<%		
		} else if(s.equals("favorites")){
	%>
			<h1> favorites </h1>
	<%		
		} else if(s.equals("profile")){
	%>
			<h1> profile </h1>
	<%		
		} else if(s.equals("changep")){
	%>
			<h1> change </h1>
	<%		
		} else if(s.equals("forgot")){
	%>
			<h1> forgot </h1>
	<%		
		}
	%>
	</body>
</html>