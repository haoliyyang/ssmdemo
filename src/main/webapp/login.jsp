<%--
  Created by IntelliJ IDEA.
  User: haoly1997
  Date: 2020/11/2
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<form action="LoginUser" method="post">
用户名：<input type="text" name="username">
  密码：<input type="text" name="password">
    <input type="submit" value="提交">
    <font color="red">${requestScope.msg}</font>
</form>
</body>
</html>
