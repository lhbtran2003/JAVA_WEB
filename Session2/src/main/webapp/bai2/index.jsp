<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form method="post" action="<%=request.getContextPath()%>/ex2">
    Họ tên: <input type="text" name="name" required><br><br>
    Tuổi: <input type="number" name="age" required><br><br>
    <input type="submit" value="Gửi">
</form>
</body>
</html>