<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head><title>Thêm/Sửa sinh viên</title></head>
<body>
<h2>Thông tin sinh viên</h2>
<form:form modelAttribute="user" action="/save" method="post">
  <form:hidden path="id"/>

  Tên: <form:input path="name"/><form:errors path="name"/><br/>
  Email: <form:input path="email"/><form:errors path="email"/><br/>
  Ngày sinh: <form:input path="dob" type="date"/><form:errors path="dob"/><br/>

  <input type="submit" value="Lưu"/>
</form:form>
</body>
</html>
