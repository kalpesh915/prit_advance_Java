<%-- 
    Document   : newjsp8
    Created on : Feb 18, 2026, 7:40:46 PM
    Author     : Kalpesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="age" value="41"></c:set>
        
        <c:choose>
            <c:when test="${age >= 18}">
                <p>Welcome for voting</p>
            </c:when>
            <c:when test="${age >= 13}">
                <p>Try in next election</p>
            </c:when>
            <c:otherwise>
                <p>Please wait for few years</p>
            </c:otherwise>
        </c:choose>
    </body>
</html>
