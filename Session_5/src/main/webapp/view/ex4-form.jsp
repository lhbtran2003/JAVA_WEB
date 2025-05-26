<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 5/26/2025
  Time: 8:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Chỉnh sửa thông tin</h1>
<form action="<%=request.getContextPath()%>/ex4-update" method="post">
    <input type="hidden" name="id" value="${student.id}" />
    <p>Họ tên: <input type="text" name="name" value="${student.name}" /></p>
    <p>Tuổi: <input type="number" name="age" value="${student.age}" /></p>
    <p>Địa chỉ: <input type="text" name="address" value="${student.address}" /></p>
    <button type="submit">Cập nhật</button>
</form>
</body>
</html>
