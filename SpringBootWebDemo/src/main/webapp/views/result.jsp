<%@page language="java" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
</body>
<!-- <h2>Result is: <%= session.getAttribute("result") %></h2> --> <!-- This is the JSP way of getting the data -->
<!-- <h2>Result is: ${result} </h2> --> <!-- This is the JSTL way of getting the data -->

<h2> Welcome!!!</h2>
<p>${alien}</p>
<p>Welcome to the ${course} World!!!</p>
</body>
</html>