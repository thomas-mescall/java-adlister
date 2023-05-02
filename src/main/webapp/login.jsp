<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="login.jsp">

    <label for="user"></label>
    <input id="user" placeholder="username..." type="email" required>
    <label for="password"></label>
    <input id="password" placeholder="password..." type="password" required>
    <input type="submit" value="Login">

</form>

<!-- checking to see if submitted is admin -->
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
//    redirecting to profile.jsp
    if(username != null && password != null && username.equals("admin") && password.equals("password")) {
        response.sendRedirect("profile.jsp");
    }
//    redirecting back to log in.jsp
    else {
        response.sendRedirect("login.jsp");
    }
%>

View the page source!

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->

</body>
</html>
