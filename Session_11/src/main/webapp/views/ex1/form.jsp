<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Nhập Người Dùng</title>
</head>
<body>

<h2>Nhập thông tin người dùng</h2>

<form:form action="/ex1" method="post" modelAttribute="user">
    <label>Họ tên:</label><br>
    <form:input path="name" type="text" name="name"/><br><br>
    <form:errors path="name" type="text" name="name"/><br><br>

    <label>Email:</label><br>
    <form:input path="email" type="email" name="email"/><br><br>
    <form:errors path="email" type="text" name="name"/><br><br>


    <label>Số điện thoại:</label><br>
    <form:input path="phone" type="text" name="phone"/><br><br>
    <form:errors path="phone" type="text" name="name"/><br><br>


    <label>Mật khẩu:</label><br>
    <form:input path="password" type="password" name="password"/><br><br>
    <form:errors path="password" type="text" name="name"/><br><br>


    <form:input path="status" type="hidden" value="true"/>
    <button type="submit">Submit</button>

</form:form>

</body>
</html>
