
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/books" method="post">
  <label for="title">Tên sách:</label><br>
  <input type="text" id="title" name="title" required value="${book.name}"><br><br>


  <label for="price">Giá (VNĐ):</label><br>
  <input type="number" id="price" name="price" min="0" step="1000" required value="${book.price}"><br><br>

  <input type="hidden" name="action" value="update" >
  <button type="submit">Sửa Sách</button>
  <a href="<%=request.getContextPath()%>/books">Hủy</a>
</form>
</body>
</html>
