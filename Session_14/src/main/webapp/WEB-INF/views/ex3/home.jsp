<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<fmt:setLocale value="${language}" />
<fmt:setBundle basename="message" />

<h1>
  <fmt:message key="welcome.message"/>
</h1>

<form action="/change-language" method="post">
  <select name="language" onchange="this.form.submit()">
    <option value="vi" ${language == 'vi' ? 'selected="selected"' : ''}>Tiếng Việt</option>
    <option value="en" ${language == 'en' ? 'selected="selected"' : ''}>English</option>
  </select>
</form>

</body>
</html>
