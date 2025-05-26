<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Book</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/books" method="post">
    <label for="title">Tên sách:</label><br>
    <input type="text" id="title" name="title" required><br><br>

    <label for="name">Tên sách:</label><br>
    <input type="text" id="name" name="author" required><br><br>

    <label for="price">Giá (VNĐ):</label><br>
    <input type="number" id="price" name="price" min="0" step="1000" required><br><br>

    <input type="hidden" name="action" value="create">
    <button type="submit">Thêm Sách</button>
    <a href="<%=request.getContextPath()%>/books">Hủy</a>
</form>


</body>
</html>
