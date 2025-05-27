<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 5/27/2025
  Time: 9:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Form Nhập Sản Phẩm</h2>

<form action="/products/add" method="post">
    <label for="name">Tên sản phẩm:</label><br>
    <input type="text" id="name" name="name"><br><br>

    <label for="quantity">Số lượng:</label><br>
    <input type="number" id="quantity" name="quantity"><br><br>

    <label for="price">Giá:</label><br>
    <input type="number" id="price" name="price" step="0.01"><br><br>

    <input type="submit" value="Gửi">
</form>
</body>
</html>
