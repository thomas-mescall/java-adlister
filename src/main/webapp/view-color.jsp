<%--
  Created by IntelliJ IDEA.
  User: ttmescal
  Date: 5/3/23
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Color</title>
</head>
<body>



    <style>
        body {
        background-color: <%= request.getParameter("colorPicked")%>;
    }
    </style>



</body>
</html>
