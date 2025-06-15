<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Giỏ hàng</title></head>
<body>
<h2>Danh sách sản phẩm trong giỏ</h2>
<table border="1">
  <tr>
    <th>Tên</th>
    <th>Số lượng</th>
    <th>Hành động</th>
  </tr>
  <c:forEach items="${cart}" var="item">
    <tr>
      <td>${item.name}</td>
      <td>${item.quantity}</td>
      <td><a href="/cart/delete?name=${item.name}">Xóa</a></td>
    </tr>
  </c:forEach>
</table>

<h3>Sản phẩm đã từng thêm (cookie):</h3>
<ul>
  <c:forEach items="${recentProducts}" var="p">
    <c:if test="${not empty p}">
      <li>${p}</li>
    </c:if>
  </c:forEach>
</ul>

<a href="/cart/add">Thêm sản phẩm khác</a>
</body>
</html>
