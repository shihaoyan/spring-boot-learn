<%--
  Created by IntelliJ IDEA.
  User: shy
  Date: 2020/1/18
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h1>用户信息表</h1>
<table border="1">
    <tr align="center">
        <td>用户id</td>
        <td>用户名</td>
        <td>用户密码</td>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr align="center">
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
