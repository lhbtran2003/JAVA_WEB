<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
<c:forEach items="${list}" var="p">
    <li>${p.name}</li>
    <li>${p.quantity}</li>
    <li>${p.price}</li>
</c:forEach></ul>
</body>
</html>
