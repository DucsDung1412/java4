<%@page import="javax.swing.text.StyledEditorKit.ForegroundAction"%>
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
		ArrayList<ArrayList<String>> list = (ArrayList<ArrayList<String>>) session.getAttribute("listAcc");
	%>
		<div class="container">
			<h1>User Management</h1>
			
			<br>
			
			<h3> User Edition </h3>
			
			<br>
			
			<p>Quan ly nguoi dung ung dung!</p>
			<form action="login" method="post">
				<div class="mb-3">
					<label for="exampleInputEmail1" class="form-label">Email address</label> 
					<input name="username" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
				</div>
				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label">Password</label>
					<input name="password" type="password" class="form-control" id="exampleInputPassword1">
				</div>
				<div class="mb-3 form-check">
					<input name="checked" type="checkbox" class="form-check-input" id="exampleCheck1">
					<label class="form-check-label" for="exampleCheck1">Remember me?</label>
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
			
			<hr>
			<hr>
			<br>
			
			<h3>User List</h3>
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">Username</th>
						<th scope="col">Password</th>
						<th scope="col">Remember?</th>
					</tr>
				</thead>
				<tbody>
				<%
					if(list !=null){						
						for(ArrayList<String> ls : list){
				%>
							<tr>
								<th scope="row"><%= ls.get(0) %></th>
								<td><%= ls.get(1) %></td>
								<td><%= ls.get(2) %></td>
							</tr>
				<%
						}
					}
				%>
				</tbody>
			</table>
		</div>

		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
	</body>
</html>