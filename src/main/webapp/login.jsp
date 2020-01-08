<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nicolavirgino
  Date: 1/7/20
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "Login" %></title>
</head>
<body>
<%@include file="partials/navbar.jsp" %>

<h1>Welcome To The Site!</h1>
<form action="./login.jsp" method="POST">
    <label for="username">Username: </label>
    <input id="username" type="text" name="username" placeholder="Username" required />
    <label for="password">Password: </label>
    <input id="password" type="password" name="password" placeholder="Password" required>
    <input type="submit" value="Login">
</form>

<c:if test="${param.username.equalsIgnoreCase('admin') && param.password == 'password'}" >
    <h1>Variable names should be very descriptive</h1>
    <c:redirect url="profile.jsp">
    </c:redirect>
</c:if>

<%--<c:if test="${param.username == 'admin' && param.password == 'password'}" >--%>
<%--    <h1>Variable names should be very descriptive</h1>--%>
<%--    <%@ include file="profile.jsp" %>--%>
<%--</c:if>--%>

</body>
</html>
