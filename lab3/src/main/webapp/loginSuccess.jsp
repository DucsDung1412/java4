<%@page import="model.thongTinNV"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
	</head>
	<body>
	<%
		thongTinNV ttnv = (thongTinNV)request.getAttribute("thongTinNV");
	%>	
		<h1>Thong tin dang ky</h1>
		<ul>
			<li>${bean.getDate()}</li>
			<li>username: <%= ttnv.getusername() %></li>
			<li>date: <%= ttnv.getDate() %></li>
			<li>gender: <%= ttnv.getGender() %></li>
			<li>mary: <%= ttnv.getMary() %></li>
			<li>likes: <%= ttnv.getLike() %></li>
			<li>live: <%= ttnv.getLive() %></li>
			<li>note: <%= ttnv.getNote() %></li>
			<li><img id="image-1" alt="" height="200" src="<%= request.getScheme()+ "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath()+"/files/" + ttnv.getImage() %>"/></li>
		</ul>
		
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
	</body>
</html>