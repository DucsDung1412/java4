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
		<form action="dk-servlet" method="post" enctype="multipart/form-data">
			<div class="container mt-3">		
				<div class="mb-3">
				  	<label for="exampleFormControlInput1" class="form-label">Ten dang nhap</label>
				  	<input name="username" type="email" class="form-control" id="exampleFormControlInput1" placeholder="DungVipPro">
				</div>
				<div class="mb-3">
				  	<label for="exampleFormControl" class="form-label">Hinh anh</label>
				  	<input name="image" type="file" accept="image/*" class="form-control" id="exampleFormControl">
				</div>
				<div class="mb-3">
				  	<label for="exampleFormControlInput2" class="form-label">Ngay Sinh</label>
				  	<input name="date" type="date" class="form-control" id="exampleFormControlInput2">
				</div>
				<div class="mb-3">
				  	<label for="exampleFormControlInput1" class="form-label">Gioi tinh</label>
				  	<div class="d-flex">				  	
					  	<div class="form-check">
						  	<input class="form-check-input" type="radio" name="gender" id="flexRadioDefault1" value="Nam">
						  	<label class="form-check-label" for="flexRadioDefault1">
						    	Nam
						  	</label>
						</div>
						<div class="form-check ms-3">
						  	<input class="form-check-input" type="radio" name="gender" id="flexRadioDefault2">
						  	<label class="form-check-label" for="flexRadioDefault2">
						    	Nu
						  	</label>
						</div>
				  	</div>
				</div>
				<div class="form-check">
					<input name="mary" class="form-check-input" type="checkbox" id="flexCheckDefault">
					<label class="form-check-label" for="flexCheckDefault">
						Da co gia dinh
					</label>
				</div>
				<div class="mb-3 mt-2">
				  	<label for="exampleFormControlInput3" class="form-label">So thich</label>
				  	<div class="form-check">
						<input name="like" value="Doc Sach" class="form-check-input" type="checkbox" id="flexCheckDefault1">
						<label class="form-check-label" for="flexCheckDefault1">
							Doc sach
						</label>
					</div>
					<div class="form-check">
						<input name="like" value="Choi Game" class="form-check-input" type="checkbox" id="flexCheckDefault2">
						<label class="form-check-label" for="flexCheckDefault2">
							Choi game
						</label>
					</div>
					<div class="form-check">
						<input name="like" value="Am Nhac" class="form-check-input" type="checkbox" id="flexCheckDefault3">
						<label class="form-check-label" for="flexCheckDefault3">
							Am nhac
						</label>
					</div>
				</div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Email address</label>
					<select name="live" class="form-select" aria-label="Default select example">
					  	<option selected>Open this select menu</option>
					  	<option value="1">One</option>
					  	<option value="2">Two</option>
					  	<option value="3">Three</option>
					</select>
				</div>
				<div class="mb-3">
				  	<label for="exampleFormControlTextarea1" class="form-label">Ghi chu</label>
				  	<textarea name="note" class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>		
		
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
	</body>
</html>