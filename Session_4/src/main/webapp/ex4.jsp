<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Tên</th>
        <th>Gía</th>
        <th>Mô tả</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="p">
        <tr>
            <td>
                <c:choose>
                    <c:when test="${not empty p.id}">
                        ${p.id}
                    </c:when>
                    <c:otherwise>
                        không có thoon tin
                    </c:otherwise>
                </c:choose>
            </td>
            <td>
                <c:choose>
                    <c:when test="${not empty p.productName}">
                        ${p.productName}
                    </c:when>
                    <c:otherwise>
                        không có thoon tin
                    </c:otherwise>
                </c:choose>
            </td>
            <td>
                <c:choose>
                    <c:when test="${p.price != 0.0}">
                        ${p.price}
                    </c:when>
                    <c:otherwise>
                        không có thoon tin
                    </c:otherwise>
                </c:choose>
            </td>
            <td>
                <c:choose>
                    <c:when test="${not empty p.description}">
                        ${p.description}
                    </c:when>
                    <c:otherwise>
                        không có thoon tin
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>

    </c:forEach>


    </tbody>
</table>
</body>
</html>
