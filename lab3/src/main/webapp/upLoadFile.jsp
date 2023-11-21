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
		<form action="upload" method="post" enctype="multipart/form-data">
			<div class="container mt-3">		
				<div class="mb-3">
				  	<label for="exampleFormControlInput1" class="form-label">Hinh anh</label>
				  	<input name="photo_file" type="file" accept="image/*" class="form-control" id="exampleFormControlInput1">
				</div>
				<div class="mb-3">
				  	<label for="exampleFormControlInput1" class="form-label">Tai lieu</label>
				  	<input name="doc_file" type="file" class="form-control" id="exampleFormControlInput1">
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>		
		
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
	</body>
</html>