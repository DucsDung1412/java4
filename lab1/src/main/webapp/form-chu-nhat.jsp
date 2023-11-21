<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="chu-nhat-servlet" method="post">
		<div>
			<div style="display: flex">
				<label>Chieu rong</label>
				<input type="number" name="rong">
			</div>
			<div style="display: flex">
				<label>Chieu dai</label>
				<input type="number" name="dai">
			</div>
			<button type="submit">Tinh</button>
		</div>
	</form>
</body>
</html>