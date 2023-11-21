<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="model.project"%>
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
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse("30/10/2020");
		project p = new project("Nokia", "img/header-object.png", 100.00, 50.0, date);
	%>
		<div class="container d-flex justify-content-center mt-4">
			<div class="card" style="width: 18rem;">
				<h5 class="card-header text-center">Tên sản phẩm: <%= p.getName() %></h5>
				<img src="<%= p.getImage() %>" class="" alt="...">
				<ul class="list-group list-group-flush">
					<li class="list-group-item">Giá gốc: <del><%= p.getPrice() %>$</del></li>
					<li class="list-group-item">Giá mới: <%= p.getDiscount() %>$</li>
					<li class="list-group-item">
						Mức giá: 
						<% if(p.getDiscount() < 10){
						%> <%= "Giá thấp" %>
						<% } else if(p.getDiscount() > 100){
						%> <%= "Giá cao" %>
						<% } else {
						%> <%= "Bình thường" %>
						<% } %>
					</li>
				</ul>
				<div class="card-footer">
					<h5 class="mt-2 text-center">Ngày: <%= sdf.format(p.getDate()) %></h5>
				</div>
			</div>
		</div>
	
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
	</body>
</html>