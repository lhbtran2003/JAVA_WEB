<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 5/21/2025
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/ex3" method="post">
    Tên <input name="name" type="text"/>
    Email <input name="email" type="email"/>
    <button type="submit">Apply</button>
</form>
</body>
</html>
