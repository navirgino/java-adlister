<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nicolavirgino
  Date: 1/10/20
  Time: 11:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<h1>Which contact would you like to delete?</h1>
<%--<c:forEach var="contact" items="${contacts}">--%>
<%--    <div class="contact">--%>
<%--        <h1>${contact.firstName}</h1>--%>
<%--        <h1>${contact.lastName}</h1>--%>
<%--        <h1>${contact.phoneNum}</h1>--%>
<%--    </div>--%>
<%--</c:forEach>--%>
<form action="delete_contact.jsp" method="POST">
    <div class="form-group">
        <label for="id">ID: </label>
        <input id="id" name="firstName" class="form-control" type="text">
    </div>
    <input type="submit" class="btn btn-primary btn-block" value="Submit">

</form>
<c:forEach var="contact" items="${updatedContacts}">
    <h1>${contact.firstName}</h1>
    <h1>${contact.lastName}</h1>
    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>

</c:forEach>
</body>
</html>
