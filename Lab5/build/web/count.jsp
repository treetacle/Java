<%-- 
    Document   : count
    Created on : 2020-04-06, 09:22:39
    Author     : Treetacle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Ilosc wejsc : ${sessionScope.SesCount} </h3>
    </body>
</html>
