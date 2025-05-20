<%!
  int a = 0;
  int b = 0;
  int result = 0;
%>

<%
  String num1Str = request.getParameter("a");
  String num2Str = request.getParameter("b");

  if (num1Str != null && num2Str != null) {
    try {
      a = Integer.parseInt(num1Str);
      b = Integer.parseInt(num2Str);
      result = a + b;
    } catch (NumberFormatException e) {
      // Nếu nhập không đúng định dạng số thì giữ sum = 0
    }
  }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Nhập hai số để tính tổng</h1>
<form method="get" action="ex4.jsp">
  Số thứ nhất: <input type="text" name="a" value="<%= num1Str != null ? num1Str : "" %>" /><br/><br/>
  Số thứ hai: <input type="text" name="b" value="<%= num2Str != null ? num2Str : "" %>" /><br/><br/>
  <input type="submit" value="Tính tổng" />
</form>

<% if (num1Str != null && num2Str != null) { %>
<h2>Kết quả:</h2>
<p><%= a %> + <%= b %> = <%= result %></p>
<% } %>
</body>
</html>
