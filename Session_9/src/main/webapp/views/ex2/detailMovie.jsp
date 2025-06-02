<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/2/2025
  Time: 6:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Movie List</h2>

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Director</th>
        <th>Genre</th>
        <th>Description</th>
        <th>Duration (min)</th>
        <th>Language</th>
    </tr>
    </thead>
    <tbody>
    <c:if test="${not empty movie}">

            <tr>
                <td>${movie.id}</td>
                <td>${movie.title}td>
                <td>${movie.director}</td>
                <td>${movie.genre}</td>
                <td>${movie.description}</td>
                <td>${movie.duration}</td>
                <td>${movie.language}</td>

            </tr>

    </c:if>

    </tbody>
</table>
</body>
</html>
