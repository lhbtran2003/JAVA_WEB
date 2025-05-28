
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Thêm mới nhân viên</h1>
<form action="${pageContext.request.contextPath}/employees/add" method="post">
    Tên <input name="name" type="text"/>
    Tên <input name="email" type="text"/>
    Tên <input name="position" type="text"/>
    <button type="submit">Theem</button>
</form>
</body>
</html>
