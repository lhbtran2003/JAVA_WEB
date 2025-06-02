<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/submit-form" method="post" modelAttribute="userSubmitted">
    Tên: <form:input path="name"/>
    Tên: <form:input path="age"/>
    Tên: <form:input path="address"/>
    <input type="submit" value="Submit">

</form:form>
</body>
</html>
