<%--
  Created by IntelliJ IDEA.
  User: ttmescal
  Date: 5/8/23
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form action="/register" method="post">
    <label for="username">Enter Username</label>
    <input id="username" name="username" type="text">
    <label for="email">Enter Email</label>
    <input id="email" name="email" type="email">
    <label for="password">Enter Password</label>
    <input id="password" name="password" type="password">
    <button type="submit">Submit</button>
</form>

</body>
</html>
