<%@page import="java.util.ArrayList"%>
<%@page import="model.project"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date date = sdf.parse("30/10/2020");
	ArrayList<project> list = new ArrayList<>();
	project p1 = new project("Nokia 1", "img/header-object.png", 100.00, 50.0, date);
	project p2 = new project("Nokia 2", "img/header-object.png", 200.00, 150.0, date);
	project p3 = new project("Nokia 3", "img/header-object.png", 300.00, 5.0, date);
	project p4 = new project("Nokia 4", "img/header-object.png", 400.00, 10.0, date);
	list.add(p1);
	list.add(p2);
	list.add(p3);
	list.add(p4);
%>
	<div class="container">
		<header class="row bg-light">
			<div class="d-flex justify-content-between">
				<div
					class="col-lg-7 col-md-7 col-sm-5 collapse d-flex flex-column justify-content-center">
					<h1>Online shopping mall</h1>
					<h5>the center point of the professional programing</h5>
				</div>
				<div class="col-lg-5 col-md-5 col-sm-7 d-flex align-items-center">
					<img src="img/header-object.png" alt="" class="h-100 w-100">
				</div>
			</div>
		</header>
	</div>

	<%@include file="menu.jsp"%>
	<div class="container">
		<div class="d-flex justify-content-center row pt-4 bg-light pb-4">
			<div class="col-sm-9 text-center">
				<div class="row">
				<form class="row" action="info" method="post">
				<%
					for(project p : list){
				%>
						<div class="col-sm-12 col-md-6 col-lg-4">
							<div class="card my-2 mt-0  w-100 p-0">
								<h5 class="card-header text-center">Tên sản phẩm: <%= p.getName() %></h5>
								<button type="submit" name="<%= p.getName() %>"> <img src="<%= p.getImage() %>" class="w-100" alt="..."> </button> 
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
				<% 
					}
				%>
				</form>
				</div>
			</div>
			<div class="col-md-3 col-sm-12 d-flex align-items-center flex-column">
				<%@include file="login.jsp"%>
	
				<%@include file="category.jsp"%>
			</div>
		</div>
		
		<footer class="row bg-body-secondary d-flex justify-content-center py-2">
                <p class="text-center text-body-secondary mb-0">FPT Polytechnic © 2023. All rights reserved.
            </p>
        </footer>
	</div>
</body>
</html>