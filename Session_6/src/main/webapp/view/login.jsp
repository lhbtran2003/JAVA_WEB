<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 5/26/2025
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Đăng nhập</h2>
<form action="/login" method="post">
    <label for="username">Tên đăng nhập:</label><br>
    <input type="text" id="username" name="username" required><br><br>

    <label for="password">Mật khẩu:</label><br>
    <input type="password" id="password" name="password" required><br><br>

    <button type="submit">Đăng nhập</button>
</form>
</body>
</html>
