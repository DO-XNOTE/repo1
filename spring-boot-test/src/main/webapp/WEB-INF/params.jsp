<%@page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>test请求参数绑定</title>
</head>
<body>
  <a href="param/testParam?username=hehe&password=123">请求</a>

  <form action="/param/saveAccount" method="post">
      姓名：<input type="text" name="username"><br>
      密码：<input type="text" name="password"><br>
      金额：<input type="text" name="money"><br>
      <input type="submit" value="提交">
  </form>


<%--封装的对象--%>
<form action="/param/saveAccount" method="post">
    姓名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    金额：<input type="text" name="money"><br>
    用户姓名：<input type="text" name="user.uname"><br>
    用户年龄：<input type="text" name="user.age"><br>
    <input type="submit" value="提交">
</form>


  <%--自定义类型转换器  参数的转换  Date--%>
  <form action="/param/saveAccount" method="post">
      用户姓名：<input type="text" name="uname"><br>
      用户年龄：<input type="text" name="age"><br>
      用户生日：<input type="text" name="date"><br>
      <input type="submit" value="提交">
  </form>



<%--把对象存储到list和map中--%>
<form action="/param/saveAccount" method="post">
    姓名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    金额：<input type="text" name="money"><br>

    用户姓名：<input type="text" name="list[0]uname"><br>
    用户年龄：<input type="text" name="list[0]age"><br>
<%--存储到map中的--%>
    用户姓名：<input type="text" name="map['one'].uname"><br>
    用户年龄：<input type="text" name="map['one'].age"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>