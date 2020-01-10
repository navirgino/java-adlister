<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nicolavirgino
  Date: 1/10/20
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Contacts</title>
</head>
<body>

<h1>Here are all the contacts: </h1>

    <c:forEach var="contact" items="${contacts}">
        <div class="contact">
            <h1>${contact.firstName}</h1>
            <h1>${contact.lastName}</h1>
            <h1>${contact.phoneNum}</h1>
        </div>
    </c:forEach>
<a href="/contacts">Show Contacts</a>
</body>
</html>
