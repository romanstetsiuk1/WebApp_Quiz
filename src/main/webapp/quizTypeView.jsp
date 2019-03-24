<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 24.03.19
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Quiz!</h2>

<ul>
    <c:forEach var="q" items="${list}">

    <li>
        <a href="servlet?id=${q.getId()}">${q.getQuizType()}</a>
    </li>

    </c:forEach>

</ul>
</body>
</html>
