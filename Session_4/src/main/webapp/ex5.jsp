<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/search-product" method="get">
  Nhập id: <input type="text" name="id-input">
</form>

<c:if test="${product != null}">
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Tên</th>
            <th>Gía</th>
            <th>Mô tả</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${product.id}</td>
            <td>${product.productName}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
        </tr>
        </tbody>
    </table>
</c:if>
<c:if test="${product == null}">
    san pham ko ton tai
</c:if>
</body>
</html>
