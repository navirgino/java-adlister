<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nicolavirgino
  Date: 1/13/20
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session</title>
</head>
<body>
<h1>This is the session JSP</h1>

<h2><c:out value="${sessionScope.sesAt}" /> </h2>
<h2>This is how to get session date:  <c:out value="${sessionScope.theName}" /></h2>
<h2>You have <c:out value="${sessionScope.cart.numItems}" /> items in your cart.</h2>
<h2><% request.getSession().getMaxInactiveInterval(); %></h2>

</body>
</html>
