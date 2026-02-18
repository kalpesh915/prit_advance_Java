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
        <c:set var="age" value="12"></c:set>
        
        <c:if test="${age >= 18}">
            <h1>Welcome to voting booth</h1>
        </c:if>
        <c:if test="${!(age >= 18)}">
            <h1>Try in Next Election</h1>
        </c:if>
    </body>
</html>
