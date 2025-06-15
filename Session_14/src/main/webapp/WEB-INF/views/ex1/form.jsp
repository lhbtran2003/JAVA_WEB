<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Login Form</h1>
<c:if test="${errorExisted != null}">
    <h3 style="color: brown">${errorExisted}</h3>
</c:if>
<c:if test="${errorPassword != null}">
    <h3 style="color: brown">${errorPassword}</h3>
</c:if>
<form:form action="/login" method="post" modelAttribute="user">
    <div>
        Tên đăng nhập: <form:input path="username" type="text"/>
        <form:errors path="username"/>
    </div>
    <div>
        Mật khẩu: <form:input path="password" type="text"/>
        <form:errors path="password"/>
    </div>

    <button type="submit">Login</button>
</form:form>
</body>
</html>
