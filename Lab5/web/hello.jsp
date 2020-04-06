<%-- 
    Document   : hello
    Created on : 2020-04-05, 21:59:37
    Author     : Treetacle

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 5</title>
    </head>
    <body>
        <h1>Witaj, ${p1.getFirstName()} ${p1.getLastName()}! <a href="mailto:${p1.getEmail()}"> mail to: ${p1.getEmail()}</a></h1>

        <h1>Cześć, ${imie}!</h1>
        <h1>Cześć, <c:out value="${imie}"/>!</h1>
        
        <c:forEach items="${dniTygodnia}" var="dzien">
        <p>
        ${dzien}
        </p>
        </c:forEach>
    </body>
</html>
