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
		}
	%>
		<div class="container">
				<h1 class="mt-4 fw-blod">SIGN IN</h1>
				<form action="login" method="post">
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Email address</label> 
						<input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" value="<%= session.getAttribute("email") != null ? String.valueOf(session.getAttribute("email")) : "" %>">
					</div>
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Password</label>
						<input name="password" type="password" class="form-control" id="exampleInputPassword1" value="<%= password %>">
					</div>
					<div class="mb-3 form-check">
						<input name="remember" type="checkbox" class="form-check-input" id="exampleCheck1">
						<label class="form-check-label" for="exampleCheck1">Remember me?</label>
					</div>
					<button type="submit" class="btn btn-primary" name="login">Submit</button>
				</form>
		</div>
	
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
	</body>
</html>