<%--
  Created by IntelliJ IDEA.
  User: liusheng
  Date: 2019/2/10
  Time: 12:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>asn upload demo</title>
</head>
<body>
    <form action="<c:url value="/upload.action"/>" enctype="multipart/form-data" method="post">
        <table>
            <tr>
                <td>文件描述：</td>
                <td><input type="text" name="description"></td>
            </tr>
            <tr>
                <td>请选择文件：</td>
                <td><input type="file" name="file"></td>
            </tr>
            <tr>
                <td><input type="submit" name="upload"> </td>
            </tr>
        </table>

    </form>
</body>
</html>
