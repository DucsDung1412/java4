<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<% 
		String lang = ""+session.getAttribute("lang");
		String s = session.getAttribute("mess") != null ? ""+session.getAttribute("mess") : "home";
	%>
	<fmt:setLocale value="<%= lang %>" scope="request"/>
	<fmt:setBundle basename="global" scope="request"/>
	<%-- <%
		if(s.equals("index")){
	%>
		<h1> <fmt:message key="index.title"/> </h1>
	<%
		} else if(s.equals("about")){
	%>
		<h1> <fmt:message key="about.title"/> </h1>
	<%
		} else if(s.equals("contact")){
	%>
		<h1> <fmt:message key="contact.title"/> </h1>
	<%
		}
	%> --%>
	<%
		if(s.equals("home")){
	%>
			<h1><fmt:message key="menu.home"/></h1>
	<%
		} else if(s.equals("about")){
	%>
			<h1><fmt:message key="menu.about"/></h1>
	<%
			} else if(s.equals("contact")){
	%>
			<h1><fmt:message key="menu.contact"/></h1>
	<%
		} else if(s.equals("faq")){
	%>
			<h1><fmt:message key="menu.faq"/></h1>
	<%	
		} else if(s.equals("signin")){
	%>
	<fmt:setBundle basename="signin" scope="request"/>
			<div class="modal-content rounded-4 shadow" style="width: 60%;">
				<div class="modal-header p-5 pb-4 border-bottom-0">
					<h1 class="fw-bold mb-0 fs-2"><fmt:message key="signin.title"/></h1>
				</div>
		
				<div class="modal-body p-5 pt-0">
					<form class="">
						<div class="form-floating mb-3">
							<input type="email" class="form-control rounded-3"
								id="floatingInput" placeholder="name@example.com"> <label
								for="floatingInput"><fmt:message key="signin.email"/></label>
						</div>
						<div class="form-floating mb-3">
							<input type="password" class="form-control rounded-3"
								id="floatingPassword" placeholder="Password"> <label
								for="floatingPassword"><fmt:message key="signin.password"/></label>
						</div>
						<button class="w-100 mb-2 btn btn-lg rounded-3 btn-primary"
							type="submit"><fmt:message key="signin.btn"/></button>
						<small class="text-body-secondary">By clicking Sign in, you
							agree to the terms of use.</small>
						<hr class="my-4">
						<h2 class="fs-5 fw-bold mb-3"><fmt:message key="signin.third"/></h2>
						<button class="w-100 py-2 mb-2 btn btn-outline-secondary rounded-3"
							type="submit">
							<i class="fa-brands fa-twitter"></i> Sign in with Twitter
						</button>
						<button class="w-100 py-2 mb-2 btn btn-outline-primary rounded-3"
							type="submit">
							<i class="fa-brands fa-facebook"></i> Sign in with Facebook
						</button>
						<button class="w-100 py-2 mb-2 btn btn-outline-secondary rounded-3"
							type="submit">
							<i class="fa-brands fa-github"></i> Sign in with GitHub
						</button>
					</form>
				</div>
			</div>
	<%		
		} else if(s.equals("signup")){
	%>
	<fmt:setBundle basename="signup" scope="request"/>
			<div class="modal-content rounded-4 shadow" style="width: 60%;">
				<div class="modal-header p-5 pb-4 border-bottom-0">
					<h1 class="fw-bold mb-0 fs-2"><fmt:message key="signup.title"/></h1>
				</div>
		
				<div class="modal-body p-5 pt-0">
					<form class="">
						<div class="form-floating mb-3">
							<input type="email" class="form-control rounded-3"
								id="floatingInput" placeholder="name@example.com"> <label
								for="floatingInput"><fmt:message key="signup.email"/></label>
						</div>
						<div class="form-floating mb-3">
							<input type="password" class="form-control rounded-3"
								id="floatingPassword" placeholder="Password"> <label
								for="floatingPassword"><fmt:message key="signup.password"/></label>
						</div>
						<div class="form-floating mb-3">
							<input type="password" class="form-control rounded-3"
								id="floatingPassword" placeholder="Password"> <label
								for="floatingPassword"><fmt:message key="signup.cfpassword"/></label>
						</div>
						<button class="w-100 mb-2 btn btn-lg rounded-3 btn-primary"
							type="submit"><fmt:message key="signup.btn"/></button>
						<small class="text-body-secondary">By clicking Sign up, you
							agree to the terms of use.</small>
						<hr class="my-4">
						<h2 class="fs-5 fw-bold mb-3"><fmt:message key="signup.third"/></h2>
						<button class="w-100 py-2 mb-2 btn btn-outline-secondary rounded-3"
							type="submit">
							<i class="fa-brands fa-twitter"></i> Sign up with Twitter
						</button>
						<button class="w-100 py-2 mb-2 btn btn-outline-primary rounded-3"
							type="submit">
							<i class="fa-brands fa-facebook"></i> Sign up with Facebook
						</button>
						<button class="w-100 py-2 mb-2 btn btn-outline-secondary rounded-3"
							type="submit">
							<i class="fa-brands fa-github"></i> Sign up with GitHub
						</button>
					</form>
				</div>
			</div>
	<%		
		} else if(s.equals("signout")){
	%>
			<h1> signout </h1>
	<%		
		} else if(s.equals("favorites")){
	%>
			<h1> favorites </h1>
			<%@include file="test.jsp" %>
	<%		
		} else if(s.equals("profile")){
	%>
			<h1> profile </h1>
	<%		
		} else if(s.equals("changep")){
	%>
			<h1> change </h1>
	<%		
		} else if(s.equals("forgot")){
	%>
			<h1> forgot </h1>
	<%		
		}
	%>
	</body>
</html>