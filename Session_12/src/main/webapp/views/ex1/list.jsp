<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Danh sách sinh viên</title></head>
<body>
<h2>Danh sách sinh viên</h2>
<a href="add">Thêm sinh viên</a>
<table border="1">
    <tr>
        <th>Tên</th>
        <th>Email</th>
        <th>Ngày sinh</th>
        <th>Hành động</th>
    </tr>
    <c:forEach var="s" items="${users}">
        <tr>
            <td>${s.name}</td>
            <td>${s.email}</td>
            <td>${s.dob}</td>
            <td>
                <a href="edit/${s.id}">Sửa</a> |
                <a href="delete/${s.id}">Xoá</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
