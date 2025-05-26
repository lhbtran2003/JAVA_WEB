<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Họ và tên</th>
        <th>Tuổi</th>
        <th>Địa chỉ</th>
        <th>Hành động</th>
    </tr>
    <c:forEach items="list" var="stu">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.name}</td>
            <td>${stu.age}</td>
            <td>${stu.address}</td>
            <td>
                <a href="<%=request.getContextPath()%>/ex4?id=${student.id}">Sửa</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
