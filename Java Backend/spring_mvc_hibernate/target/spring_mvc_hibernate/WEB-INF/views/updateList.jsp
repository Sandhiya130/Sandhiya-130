<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>


<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</p>

	<form action="" method="post">
			<tr>
				<td>userId    : ${userId}</td>
				<td>userName   : <input type="text" name="id" value=${userName}></td>
				<td>userEmail   : <input type="text" name="id" value=${userName}></td>
				<td><a href="/spring_mvc_example/update/${userId}"></a></td>
			</tr>
			<br>
			</tr>
		 <input
			type="submit" value="Update">
	</form>
</body>
</html>