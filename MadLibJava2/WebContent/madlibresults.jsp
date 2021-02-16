<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results for Mad Lib</title>
</head>
<body>
<p>Read the mad lib below. <br />
It was yesterday when <strong>${userMadLibPouch.getName()}</strong> was out and about doing their thing. <br />
While they were <strong>${userMadLibPouch.getActivity()}</strong> out of nowhere a wild <strong>${userMadLibPouch.getAnimal() }</strong> <br />
attacked them. What <strong>${userMadLibPouch.getName()}</strong> didn't realize was the <strong>${userMadLibPouch.getAnimal() }</strong> <br />
wanted the tasty <strong>${userMadLibPouch.getFood()}</strong> in their pocket. <br />
</p>
<a href="index.jsp">Want to do this mad lib again?</a><br />
<a href="index2.jsp">Want to do a different mad lib?</a>
</body>
</html>