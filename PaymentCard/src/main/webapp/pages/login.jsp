<%--
  Created by IntelliJ IDEA.
  User: Nick
  Date: 12.03.2017
  Time: 8:16
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>4team</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/login.css" />" >

</head>
<body>
<h1> ${message}</h1>
<form method="POST">
    Username: <input type="text" name="username"/><br/>
    Password: <input type="password" name="password"/><br/>
    <input type="submit" value="Log in" />
</form>
</body>
</html>