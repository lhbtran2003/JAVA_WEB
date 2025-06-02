<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/2/2025
  Time: 9:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/account/add" method="post" modelAttribute="account">
  Tên: <form:input path="username"/>
  Mật khau: <form:input path="password"/>
  Email: <form:input path="email"/>
  <input type="submit" value="Submit">

</form:form>
</body>
</html>
