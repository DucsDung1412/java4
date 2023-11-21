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
		String email = session.getAttribute("email") != null ? String.valueOf(session.getAttribute("email")) : "you";
		String password = session.getAttribute("password") != null ? String.valueOf(session.getAttribute("password")) : "";
		Boolean role = false;
		Boolean logout = session.getAttribute("logout") != null ? (Boolean)session.getAttribute("logout") : true;
		if(session.getAttribute("role") != null){
			role = (Boolean)session.getAttribute("role");
		}
		if(logout){
			email = "you";
	%>
			<jsp:forward page="bai3_1.jsp"></jsp:forward>
	<%
		}
	%>
	
		<div class="container">
			<form action="login" method="post">
				<h1>Welcome <%= email %></h1>
				<% if(session.getAttribute("email") != null && !(Boolean)session.getAttribute("logout")){ %>	
					<button type="submit" class="btn btn-primary mt-3" name="logout">Logout</button>
					<% if(role){ %>
						<button formaction="admin" type="submit" class="btn btn-primary mt-3" name="admin">Admin</button>
					<% } 
				} %>
			</form>
		</div>
	
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
	</body>
</html>