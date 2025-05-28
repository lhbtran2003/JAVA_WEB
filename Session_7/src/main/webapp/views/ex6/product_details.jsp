<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 5/28/2025
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Chi tiết sản phẩm</h1>

<c:if test="${not empty product}">
    <table border="1" cellpadding="10">
        <tr>
            <td colspan="2" align="center">
                <img src="${product.image}" alt="Image" width="200" height="200">
            </td>
        </tr>
        <tr>
            <th>Tên sản phẩm</th>
            <td>${product.name}</td>
        </tr>
        <tr>
            <th>Giá</th>
            <td>${product.price} VND</td>
        </tr>
        <tr>
            <th>Số lượng trong kho</th>
            <td>${product.stock}</td>
        </tr>
        <tr>
            <th>Mô tả</th>
            <td>${product.description}</td>
        </tr>
    </table>
</c:if>


<br>
<a href="/get-list-product">Quay lại danh sách sản phẩm</a>
</body>
</html>
