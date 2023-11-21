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
			String img = request.getParameter("img");
			String title = request.getParameter("title");
		%>
			<%-- <div class="col-sm-12 col-md-6 col-lg-4">
				<div class="card my-2 mt-0  w-100 p-0">
					<img src="<%=img%>" class="card-img-top w-100" alt="...">
					<div class="py-2">
						<p class="card-text"><%=title%></p>
					</div>
				</div>
			</div> --%>
			
			<div class="col-lg-4">
				<div class="card" style="width: 18rem;">
					<img src="<%=img%>" class="card-img-top" alt="..." />
					<div class="card-body">
						<h5 class="card-title"><%=title%></h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Buy Now</a>
					</div>
				</div>
			</div>
	
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
	</body>
</html>