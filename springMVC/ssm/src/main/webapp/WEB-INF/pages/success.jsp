<%--
  Created by IntelliJ IDEA.
  User: 温德宝
  Date: 2019/3/15
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>成功页面</h1>

<c:forEach items="${accounts}" var="account">
    ${account.name}
</c:forEach>

</body>
</html>
