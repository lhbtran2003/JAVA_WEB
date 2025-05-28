<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách sản phẩm</h1>

<table border="1" cellpadding="10">
    <tr>
        <th>Hình ảnh</th>
        <th>Tên sản phẩm</th>
        <th>Giá</th>
        <th>Số lượng trong kho</th>
        <th>Hành động</th>
    </tr>

    <c:choose>
        <c:when test="${not empty products}">
            <c:forEach var="p" items="${products}">
                <tr>
                    <td><img src="${p.image}" alt="Image" width="100" height="100"></td>
                    <td>${p.name}</td>
                    <td>${p.price} VND</td>
                    <td>${p.stock}</td>
                    <td>
                        <form action="get-product-detail" method="post">
                            <input type="hidden" name="id" value="${p.id}" />
                            <input type="submit" value="chi tiết" />
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <tr>
                <td colspan="5">Không có sản phẩm nào.</td>
            </tr>
        </c:otherwise>
    </c:choose>
</table>
</body>
</html>
