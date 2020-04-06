<%-- 
    Document   : personList
    Created on : 2020-04-05, 23:29:19
    Author     : Treetacle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1" cellpadding="5">
            <c:forEach items="${p2}" var="p2">
            <tr>
                <td>${p2.getFirstName()}</td>
                <td>${p2.getLastName()}</td>
                <td>${p2.getEmail()}</td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>
