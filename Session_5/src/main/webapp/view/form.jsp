
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/ex3" method="post">
    <label for="name">Họ và tên:</label><br>
    <input type="text" id="name" name="name" required><br><br>

    <label for="age">Tuổi:</label><br>
    <input type="number" id="age" name="age" required><br><br>

    <label for="address">Địa chỉ:</label><br>
    <textarea id="address" name="address" rows="4" cols="30" required></textarea><br><br>

    <button type="submit">Gửi</button>
</form>
</body>
</html>
