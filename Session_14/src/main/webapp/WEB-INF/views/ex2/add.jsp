<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Thêm sản phẩm mới</h1>
<form:form action="/product/add" method="post" modelAttribute="product">
    <div>
        Mã sản phẩm: <form:input path="" type="text"/>
        <form:errors path=""/>
    </div>
    <div>
        Mã sản phẩm: <form:input path="" type="text"/>
        <form:errors path=""/>
    </div>
    <div>
        Mã sản phẩm: <form:input path="" type="text"/>
        <form:errors path=""/>
    </div>

</form:form>
</body>
</html>
