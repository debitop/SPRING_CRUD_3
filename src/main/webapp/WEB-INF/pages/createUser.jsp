<%--
  Created by IntelliJ IDEA.
  User: Саша
  Date: 18.06.2018
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/addUser">
    <table border="1" cellspacing="1" cellpadding="1">
        <tr>
            <td>Name</td>
            <td><input type="text" value="" name="name"></td>
        </tr>
        <tr>
            <td>isAdmin</td>
            <td><input type="checkbox" name="isadmin"></td>
        </tr>
    </table>
    <input type="submit" name="OK">
</form>
</body>
</html>
