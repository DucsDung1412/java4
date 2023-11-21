<%@page import="dao.user1DAO"%>
<%@page import="model.users1"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
		<style type="text/css">
			.modal{
  				background-color: rgba(0,0,0,0.4);
			}
		</style>
	</head>
	<body>
	<%
		ArrayList<users1> list = (ArrayList<users1>)user1DAO.getUsers1DAO().selectAll();
		users1 u = (users1)session.getAttribute("user");
		String mess = (String)session.getAttribute("mess");
		if(u == null){
			u = new users1("","","","","",false);
		}
	%>
		<div class="container">
			<h1>User Management</h1>
			
			<br>
			
			<h3> User Edition </h3>
			
			<br>
			
			<p>Quan ly nguoi dung ung dung!</p>
				<form action="login" method="post">
				<div class="mb-3">
					<label for="exampleInputUsername1" class="form-label">Username</label>
					<input name="username" type="text" class="form-control" id="exampleInputUsername1" value="<%= u.getUsername() %>">
				</div>
				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label">Password</label>
					<input name="password" type="password" class="form-control" id="exampleInputPassword1" value="<%= u.getPassword() %>">
				</div>
				<div class="mb-3">
					<label for="exampleInputFullname1" class="form-label">Fullname</label>
					<input name="fullname" type="text" class="form-control" id="exampleInputFullname1" value="<%= u.getFullname() %>">
				</div>
				<div class="mb-3">
					<label for="exampleInputEmail1" class="form-label">Email address</label> 
					<input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" value="<%= u.getEmail() %>">
					</div>
				<div class="d-flex mb-3">
					<div class="form-check">
						<input class="form-check-input" type="radio" name="role" id="flexRadioDefault1" value="Admin" <% if(u.getAdmin()){%>checked<%} %>> 
						<label class="form-check-label" for="flexRadioDefault1">Admin</label>
					</div>
					<div class="ms-4 form-check">
						<input class="form-check-input" type="radio" name="role" id="flexRadioDefault2" value="User" <% if(!u.getAdmin()){%>checked<%} %>> 
						<label class="form-check-label" for="flexRadioDefault2">User</label>
					</div>
				</div>
				<div class="d-flex">				
					<button type="submit" class="btn btn-primary" name="create">Create</button>
					<button type="submit" class="btn btn-primary mx-3" name="update">Update</button>
					<button type="submit" class="btn btn-primary me-3" name="delete">Delete</button>
					<button type="submit" class="btn btn-primary" name="reset">Reset</button>
				</div>
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
						<th scope="col">Fullname</th>
						<th scope="col">Email</th>
						<th scope="col">role</th>
						<th scope="col"></th>
					</tr>
				</thead>
				<tbody>
				<form action="login" method="post">
				<%
					if(list !=null){						
						for(users1 ls : list){
				%>
							<tr>
								<th scope="row"><%= ls.getUsername() %></th>
								<td><%= ls.getPassword() %></td>
								<td><%= ls.getFullname() %></td>
								<td><%= ls.getEmail() %></td>
								<td><%= ls.getAdmin() %></td>
									
								<td><button type="submit" name="<%= ls.getId() %>">Edit</button></td>
							</tr>
				<%
						}
					}
				%>
				</form>
				</tbody>
			</table>
		</div>
		
		<%
			if(mess != null){
		%>
		<div class="modal fade show" id="exampleModalCenter" tabindex="-1"
			aria-labelledby="exampleModalCenterTitle" aria-modal="true"
			role="dialog" style="display: block;">
			<div class="modal-dialog modal-dialog-centered">
				<div class="modal-content">
					<div class="modal-header">
						<h1 class="modal-title fs-5" id="exampleModalCenterTitle">Title</h1>
						<button type="button" class="btn-close" data-bs-dismiss="modal"
							aria-label="Close"></button>
					</div>
					<div class="modal-body">
						<p><%= mess %></p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary btn_OK" data-bs-dismiss="modal">OK</button>
					</div>
				</div>
			</div>
		</div>
		<%
			}
		%>
		
		<script type="text/javascript">
			document.querySelector(".btn-close").onclick = function() {
			    document.querySelector(".modal").classList.add("d-none")
			}
			document.querySelector(".btn_OK").onclick = function() {
			    document.querySelector(".modal").classList.add("d-none")
			}
		</script>
		
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
	</body>
</html>