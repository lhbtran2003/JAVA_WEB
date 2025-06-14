<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Danh sách sản phẩm</title></head>
<body>
<h2>Danh sách sản phẩm</h2>
<a href="products?action=add">Thêm sản phẩm</a>
<table border="1">
  <tr><th>ID</th><th>Tên</th><th>Giá</th><th>Số lượng</th><th>Ảnh</th><th>Hành động</th></tr>
  <c:forEach items="${products}" var="p">
    <tr>
      <td>${p.id}</td>
      <td>${p.name}</td>
      <td>${p.price}</td>
      <td>${p.quantity}</td>
      <td><img src="${p.image}" width="50"/></td>
      <td>
        <a href="products?action=edit&id=${p.id}">Sửa</a> |
        <a href="products?action=delete&id=${p.id}" >Xóa</a>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
