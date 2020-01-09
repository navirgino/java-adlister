<%--
  Created by IntelliJ IDEA.
  User: nicolavirgino
  Date: 1/8/20
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<form action="./colorpicked.jsp" method="POST">
    <label for="color">What's your favorite color? </label>
    <input id="color" type="color" name="color" placeholder="Fav color" />

    <input type="submit" value="Submit">
</form>


</body>
</html>
