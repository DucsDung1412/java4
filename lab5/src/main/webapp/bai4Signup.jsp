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
		<div class="container">
			<h1 class="mt-4 fw-blod">SIGN UP</h1>
			<form action="signup" method="post">
				<div class="mb-3">
					<label for="exampleInputFullname" class="form-label">Full Name</label> 
					<input name="fullname" type="text" class="form-control" id="exampleInputFullname">
				</div>
				<div class="mb-3">
					<label for="exampleInputEmail1" class="form-label">Email address</label> 
					<input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
				</div>
				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label">Password</label>
					<input name="password" type="password" class="form-control" id="exampleInputPassword1">
				</div>
				<div class="mb-3">
					<label for="exampleInputConfirmPassword1" class="form-label">Confirm Password</label>
					<input name="confirmPassword" type="password" class="form-control" id="exampleInputConfirmPassword1">
				</div>
				<ul class="nav nav-pills mb-3">
					<li class="nav-item"><button type="submit" class="nav-link" name="signin">Sign In</button></li>
					<li class="nav-item"><button type="submit" class="nav-link active" aria-current="page" name="signup">Sign Up</button></li>
				</ul>
				<button type="submit" class="btn btn-primary" name="submit">Submit</button>
			</form>
		</div>
	
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
	</body>
</html>