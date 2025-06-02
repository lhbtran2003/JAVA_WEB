<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/2/2025
  Time: 9:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/submit-form" method="post" modelAttribute="product">
    Tên: <form:input path="name"/>
    Gía: <form:input path="price"/>
    Mô tả: <form:input path="description"/>
    <input type="submit" value="Submit">

</form:form>
</body>
</html>
