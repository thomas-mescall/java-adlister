<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome! ${sessionScope.username}</h1>
    </div>

<form action="../logout.jsp" method="post">

    <button type="submit" name="logout">Logout</button>

</form>

</body>
</html>
