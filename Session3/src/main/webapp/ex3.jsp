
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
 String actione = request.getParameter("action");

 if ("forward".equals(actione)) {
   %>
<jsp:forward page="welcome.jsp" />
<%
   return;
 }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="home.jsp">
  <input type="hidden" name="action" value="forward" />
  <input type="submit" value="Đi tới trang chào mừng" />
</form>
</body>
</html>
