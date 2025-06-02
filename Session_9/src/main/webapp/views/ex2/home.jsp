<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:if test="${not empty list}">
        <c:forEach items="${list}" var="m">
            <tr>
                <td>${m.id}</td>
                <td>${m.title}td>
                <td>${m.director}</td>
                <td>${m.genre}</td>
                <td>${m.description}</td>
                <td>${m.duration}</td>
                <td>${m.language}</td>
                <td>
                    <form action="/detailMovie" method="get">
                        <input type="hidden" name="id" value="${m.id}">
                        <button type="submit">Detail</button>
                    </form>
                </td>
            </tr>

        </c:forEach>
    </c:if>

    </tbody>
</table>
</body>
</html>
