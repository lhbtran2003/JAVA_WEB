<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 5/26/2025
  Time: 9:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form Đăng ký</h2>

<form action="/register" method="post">
  <label for="id">ID:</label><br>
  <input type="number" id="id" name="id" required><br><br>

  <label for="username">Tên đăng nhập:</label><br>
  <input type="text" id="username" name="username" required><br><br>

  <label for="password">Mật khẩu:</label><br>
  <input type="password" id="password" name="password" required><br><br>

  <label for="email">Email:</label><br>
  <input type="email" id="email" name="email" required><br><br>

  <label for="phone">Số điện thoại:</label><br>
  <input type="text" id="phone" name="phone" required><br><br>

  <button type="submit">Đăng ký</button>
</form>

<br>
<c:if test="${not empty message}">
  <p style="color: green">${message}</p>
</c:if>
</body>
</html>
