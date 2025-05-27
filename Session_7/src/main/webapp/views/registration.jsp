<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form Nhập Thông Tin</h2>

<form action="/users/register" method="post">
    <label for="name">Tên người dùng:</label><br>
    <input type="text" id="name" name="name" value="${name}"><br><br>
    <c:if test="${not empty errorName}"><p>${errorName}</p></c:if>

    <label for="email">Email:</label><br>
    <input type="email" id="email" name="email" value="${email}"><br><br>
    <c:if test="${not empty errorEmail}"><p>${errorEmail}</p></c:if>


    <label for="phone">Số điện thoại:</label><br>
    <input type="tel" id="phone" name="phone" value="${phone}"><br><br>
    <c:if test="${not empty errorPhone}"><p>${errorPhone}</p></c:if>


    <input type="submit" value="Gửi">
</form>

</body>
</html>
