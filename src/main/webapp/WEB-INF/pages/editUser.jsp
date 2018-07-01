<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<a href="/">Home</a>
<form:form method="post" action="/updateUser/${userAttribute.id}" modelAttribute="userAttribute">
    <table>
    <tr>
    <td><form:label path="id">Id:</form:label></td>
    <td><form:input path="id" disabled="true"></td>
    </tr>
    <tr>
    <td><form:label path="name">Name:</form:label></td>
    <td><form:input path="name"></form:input></td>
    </tr>
    <tr>
    <td><form:checkbox path="isadmin">Is admin?</td>
        </tr>
        </table>
        <input type="submit" value="save">
        </form:>

        </body>
        </html>
