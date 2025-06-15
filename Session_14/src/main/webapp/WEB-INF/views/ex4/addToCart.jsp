<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Thêm sản phẩm</title></head>
<body>
<h2>Thêm sản phẩm vào giỏ hàng</h2>
<form:form action="/cart/add" modelAttribute="product" method="post">
    Tên sản phẩm: <form:input path="name"/><br/>
    Số lượng: <form:input path="quantity" type="number"/><br/>
    <button type="submit">Thêm vào giỏ</button>
</form:form>
<a href="/cart/view">Xem giỏ hàng</a>
</body>
</html>
