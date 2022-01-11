<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<center> <h1>This is Employee Management Portal </h1> </center>
	
	<h2> Enter The Details </h2>

	<form action="login" method="POST">
		<p> User Name :<input type="text" name="userName"><br>
		<p> Password  :<input type="text" name="password"><br>
		<p>${wrongpassword}</p>
		 <input
			type="submit" value="login">
	</form>
</body>
</html>