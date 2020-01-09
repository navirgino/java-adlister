<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nicolavirgino
  Date: 1/9/20
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!"/>
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp"/>
<div class="container">
    <h1>Welcome to the Adlister!</h1>
    <h2>Here are all the ads: </h2>

    <c:forEach var="ad" items="${ads}">
        <div class="ad">
            <h1>${ad.title}</h1>
            <h2>${ad.description}</h2>
        </div>
    </c:forEach>

</div>

</body>
</html>
