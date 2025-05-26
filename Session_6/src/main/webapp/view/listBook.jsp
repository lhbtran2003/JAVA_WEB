<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" cellpadding="5" cellspacing="0">
    <thead>
    <tr>
        <th>ID</th>
        <th>Tên sách</th>
        <th>Giá</th>
        <th>Hành động</th>
    </tr>
    </thead>
    <tbody>
    <c:if test="${not empty listBook}">
      <c:forEach items="${listBook}" var="book">
          <tr>
              <td><c:out value="${book.id}"/></td>
              <td><c:out value="${book.name}"/>td>
              <td><c:out value="${book.price}"/></td>
              <td>
                  <button  onclick="return confirm('Bạn có chắc chawn muốn xóa ko')"><a href="<%=request.getContextPath()%>/books?action=delete&id=${book.id}">Xóa</a></button>
                  <button><a href="<%=request.getContextPath()%>/books?action=edit">Sửa</a></button>
              </td>
          </tr>

      </c:forEach>
    </c:if>
    </tbody>
</table>

<p><a href="<%=request.getContextPath()%>/students/?action=new">Thêm sách</a></p>
</body>
</html>
