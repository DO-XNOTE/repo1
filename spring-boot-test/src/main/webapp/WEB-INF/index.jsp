<%--
  Created by IntelliJ IDEA.
  User: DO-XN
  Date: 2020/11/29
  Time: 23:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/param/saveAccount" method="post">
    姓名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    金额：<input type="text" name="money"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>