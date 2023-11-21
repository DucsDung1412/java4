<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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
					<jsp:include page="item.jsp">
						<jsp:param name="img" value="img/header-object.png"/>
						<jsp:param name="title" value="java"/>
					</jsp:include>	
					
					<jsp:include page="item.jsp">
						<jsp:param name="img" value="img/header-object.png"/>
						<jsp:param name="title" value="java"/>
					</jsp:include>	
					
					<jsp:include page="item.jsp">
						<jsp:param name="img" value="img/header-object.png"/>
						<jsp:param name="title" value="java"/>
					</jsp:include>	
					
					<jsp:include page="item.jsp">
						<jsp:param name="img" value="img/header-object.png"/>
						<jsp:param name="title" value="java"/>
					</jsp:include>	
					
					<jsp:include page="item.jsp">
						<jsp:param name="img" value="img/header-object.png"/>
						<jsp:param name="title" value="java"/>
					</jsp:include>	
					
					<jsp:include page="item.jsp">
						<jsp:param name="img" value="img/header-object.png"/>
						<jsp:param name="title" value="java"/>
					</jsp:include>	
					
					<jsp:include page="item.jsp">
						<jsp:param name="img" value="img/header-object.png"/>
						<jsp:param name="title" value="java"/>
					</jsp:include>		
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