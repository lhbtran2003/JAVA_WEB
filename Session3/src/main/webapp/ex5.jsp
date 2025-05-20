<%!
  // Kiểm tra xem form đã được gửi hay chưa (phương thức POST)
  String name = "";
  String email = "";
  String password = "";
  boolean submitted = false;
%>
<%
  String method = request.getMethod();

  if ("POST".equalsIgnoreCase(method)) {
    name = request.getParameter("name");
    email = request.getParameter("email");
    password = request.getParameter("password");
    submitted = true;
  }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (!submitted) {%>
<form action="ex5.jsp" method="post">
  Username: <input type="text" name="username"/><br/>
  Password <input type="text" name="password"/><br/>
  Email <input type="email" name="email"/><br/>
    <button type="submit">Register</button>

</form>

<%} else {%>
<h2>Đăng ký thành công!</h2>
<p>Thông tin người dùng:</p>
<ul>
    <li>Tên: <%= name %></li>
    <li>Email: <%= email %></li>
    <li>Mật khẩu: <%= password %>
</ul>
<%}%>
</body>
</html>
