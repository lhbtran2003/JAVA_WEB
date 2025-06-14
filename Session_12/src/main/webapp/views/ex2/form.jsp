<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Thêm/Sửa sản phẩm</title></head>
<body>
<h2>${product != null ? "Sửa" : "Thêm"} sản phẩm</h2>
<form method="post" action="products">
    <input type="hidden" name="id" value="${product.id}"/>
    Tên: <input type="text" name="name" value="${product.name}"/><br/>
    Giá: <input type="text" name="price" value="${product.price}"/><br/>
    Số lượng: <input type="number" name="quantity" value="${product.quantity}"/><br/>
    Hình ảnh (URL): <input type="text" name="image" value="${product.image}"/><br/>
    <input type="submit" value="Lưu"/>
</form>
<c:if test="${not empty error}">
    <p style="color: red">${error}</p>
</c:if>
<a href="products">Quay lại</a>
</body>
</html>
