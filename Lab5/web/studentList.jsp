<%-- 
    Document   : studentList
    Created on : 2020-04-06, 10:05:26
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
        <table border="1" cellpadding="5">
            <c:forEach items="${sessionScope.SesSutdentList}" var="SesSutdentList">
                <tr>
                    <td><c:out value="${SesSutdentList.getFirstName()}"/></td>
                    <td><c:out value="${SesSutdentList.getLastName()}"/></td>
                    <td><c:out value="${SesSutdentList.getEmail()}"/></td>
                </tr>
            </c:forEach>
        </table>

        <form action='/Lab5/studentList' method='post'>
            Imie: <input type='text' name='imie'><br/>
            Nazwisko <input type='text' name='nazwisko'><br/>
            Email <input type='text' name='email'><br/>
            <input type='submit'>
	</form>
    </body>
</html>
