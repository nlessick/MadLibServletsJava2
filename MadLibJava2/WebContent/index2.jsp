<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second MadLib</title>
</head>
<body>
	<h1>Welcome to the Second MabLib!</h1>
	<form action="getSecondMadLibServlet" method="post">
	Enter a name: <input type="text" name="userName" size="10">
	Enter a location: <input type="text" name="userLocation" size="20">
	Enter a noun: <input type="text" name="userFirstNoun" size="20">
	Enter a second noun: <input type="text" name="userSecondNoun" size="20"><br />
	Enter a plural noun: <input type="text" name="userPluralNoun" size="20">
	Enter an adjective: <input type="text" name="userFirstAdjective" size="20">
	Enter a second adjective: <input type="text" name="userSecondAdjective" size="20">
	<input type="submit" value="Second Mad Lib" />
	</form>
</body>
</html>