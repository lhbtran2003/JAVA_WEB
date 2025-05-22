<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/login" method="post">
    Username <input name="username" type="text"/>
    Password <input name="password" type="text"/>
    <button type="submit">Apply</button>
</form>

<c:if test="${correct}">
    <h2>Xin chào admin</h2>
</c:if>
<c:if test="${correct == false}">
    <h2>đăng nhập thất bại</h2>
</c:if>

</body>
</html>
