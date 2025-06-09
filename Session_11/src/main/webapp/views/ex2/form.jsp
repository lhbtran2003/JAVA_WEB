<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Đăng ki</h2>

<form:form action="/ex1" method="post" modelAttribute="registerer">
  <label>Họ tên:</label><br>
  <form:input path="name" type="text" name="name"/><br><br>
  <form:errors path="name" type="text" name="name"/><br><br>

  <label>Email:</label><br>
  <form:input path="email" type="email" name="email"/><br><br>
  <form:errors path="email" type="text" name="name"/><br><br>

  <label>Mật khẩu:</label><br>
  <form:input path="password" type="password" name="password"/><br><br>
  <form:errors path="password" type="text" name="name"/><br><br>

  <button type="submit">Submit</button>

</form:form>
</body>
</html>
