
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String name = request.getParameter("name");
  String age = request.getParameter("age");

  if (name!=null && age!=null) {
      application.setAttribute("name", name);
      application.setAttribute("age", age);
  }

  String saveName = (String) application.getAttribute("name");
  String saveAge = (String) application.getAttribute("age");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="ex2.jsp">
    Tên: <input type="text" name="name" value="<%= (saveName != null) ? saveName : "" %>" required><br><br>
    Tuổi: <input type="text" name="age" value="<%= (saveAge != null) ? saveAge : "" %>" required><br><br>
    <input type="submit" value="Lưu thông tin">
</form>

<p>Tên: <%= (saveName != null) ? saveName : "Chưa có dữ liệu" %></p>
<p>Email: <%= (saveAge != null) ? saveAge : "Chưa có dữ liệu" %></p>
</body>
</html>
