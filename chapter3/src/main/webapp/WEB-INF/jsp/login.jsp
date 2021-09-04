<%--
  Created by IntelliJ IDEA.
  User: liusheng
  Date: 2019/2/9
  Time: 11:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>asn demo登录</title>
</head>
<body>
    <c:if test="${!empty error}">
        <font color="red"><c:out value="${error}" /></font>
    </c:if>
    <form action="<c:url value="/loginCheck.html"/>" method="post">
        用户名：
        <input type="text" name="userName">
        <br>
        密码：
        <input type="password" name="password">
        <br>
        <input type="submit" value="登录"/>
        <input type="reset" value="重置" />

    </form>
</body>
</html>
