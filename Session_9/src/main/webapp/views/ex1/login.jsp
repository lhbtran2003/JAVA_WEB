
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login" method="post">
    Tên đăng nhập: <input type="text" name="username">
    <p style="color:red">${usernameErr}</p>
    Mật khẩu: <input type="text" name="password">
    <p style="color:red">${passwordErr}</p>

    <p style="color:blue">${inform}</p>

    <input type="submit" value="Đăng nhập" />



</form>
</body>
</html>
