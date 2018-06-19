<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Саша
  Date: 05.06.2018
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table cellpadding="1" cellspacing="1" border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>IsAdmin</td>
        <td>CreateDate</td>
        <td></td>
        <td></td>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td><c:out value="${user.id}"></c:out></td>
            <td><c:out value="${user.name}"></c:out></td>
            <td><c:if test="${user.isadmin}==true">+</c:if></td>
            <td><c:out value="${user.createdate}"></c:out></td>
            <td><a href="updateUser?id=${user.id}">Update</a></td>
            <td><a href="deleteUser?id=${user.id}">Delete</a></td>
        </tr>

    </c:forEach>
    <tr><a href="createUser">CreateUser</a></tr>
</table>


</body>
</html>
