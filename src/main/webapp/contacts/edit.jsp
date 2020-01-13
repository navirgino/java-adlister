<%--
  Created by IntelliJ IDEA.
  User: nicolavirgino
  Date: 1/13/20
  Time: 8:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Contact</title>
</head>
<body>
<h1>Edit Some Contactz: </h1>
<form action = "/contacts/edit" method="POST">
    <div>
        <label for="firstName">First Name</label>
        <input value="${contact.firstName}" id="firstName" name="firstName" placeholder="Enter your first name: ">
    </div>
    <div>
        <lavel for="lastName">Last Name</lavel>
        <input value="${contact.lastName}" id="lastName" name="lastName" placeholder="Enter your last name: ">
    </div>

    <input type="hidden" name="id" value="${contact.id}">
    <button>Submit</button>
</form>

</body>
</html>
