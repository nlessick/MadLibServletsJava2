<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second Mad Lib Results</title>
</head>
<body>
<p>Read the mad lib below. <br />
At the house where <strong>${userSecondMadLibPouch.getName()}</strong> grew up was located in the popular town of <strong>${userSecondMadLibPouch.getLocation()}</strong>.<br />
The parents of <strong>${userSecondMadLibPouch.getName()}</strong> created their own homemade pizza. Here are the special ingredients.<br />
To make this special pizza you will need dough already made. Then you will put <strong>${userSecondMadLibPouch.getFirstAdjective()}</strong><br />
sauce all over the dough. Then put as much <strong>${userSecondMadLibPouch.getFirstNoun()}</strong> and <strong>${userSecondMadLibPouch.getSecondNoun()}</strong> as you want.<br />
Sprinkle a fair amount of <strong>${userSecondMadLibPouch.getSecondAdjective()}</strong> cheese and some finely chopped <strong>${userSecondMadLibPouch.getPluralNoun()}</strong>.<br />
Bake it in the oven for about 25 minutes or until golden brown. Serve and enjoy this new experience. 
</p>
<a href="index2.jsp">Want to do this mad lib again?</a><br />
<a href="index.jsp">Want to do a different mad lib?</a>
</body>
</html>