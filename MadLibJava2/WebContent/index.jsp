<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mad Lib for Java 2</title>
</head>
<body>
	<h1>Welcome to my mad lib website.</h1>
	<form action="getMadLibServlet" method="post">
	Enter a name: <input type="text" name="userName" size="10">
	Enter a food: <input type="text" name="userFood" size="10">
	Enter an animal: <input type="text" name="userAnimal" size="10">
	Enter an activity: <input type="text" name="userActivity" size="20">
	<input type="submit" value="Mad Lib" />
	</form>
</body>
</html>