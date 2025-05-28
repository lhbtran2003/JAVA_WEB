<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 5/28/2025
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách nhân viên</h1>
<table>
  <thead>
    <tr>
      <td>Tên</td>
      <td>Email</td>
      <td>Vị trí</td>
    </tr>
  </thead>
  <tbody>
  <c:if test="${not empty list}">
    <c:forEach items="${list}" var="e">
      <tr>
        <td>${e.name}</td>
        <td>${e.email}</td>
        <td>${e.position}</td>
      </tr>
    </c:forEach>
  </c:if>

  </tbody>
</table>
<c:if test="${not empty list}">
  <c:forEach items="${list}" var="e">

  </c:forEach>
</c:if>
</body>
</html>
