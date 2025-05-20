<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%!
    String name = "Bảo Trân";
    int age = 20;
    String major = "Công nghệ thông tin";
%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - ex1</title>
</head>
<body>
<h1>Thông tin cá nhân</h1>
<p>Họ tên: <%= name %>
</p>
<p>Tuổi: <%= age %>
</p>
<p>Ngành học: <%= major %>
</p>

</body>
</html>