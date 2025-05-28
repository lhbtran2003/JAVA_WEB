<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 5/28/2025
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Danh sách người dùng</h2>
<table border="1" cellpadding="8">
    <thead>
    <tr>
        <th>Họ tên</th>
        <th>Tuổi</th>
        <th>Ngày sinh</th>
        <th>Email</th>
        <th>Số điện thoại</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.birthday}</td>
            <td>${user.email}</td>
            <td>${user.phone}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
