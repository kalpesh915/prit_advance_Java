<%-- 
    Document   : newjsp7
    Created on : Feb 18, 2026, 7:38:16 PM
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
        <c:catch var="error">
            <c:out value="${100 / 0}"></c:out>
        </c:catch>
        
        <c:if test="${not empty error}">
            <p>${error}</p>
        </c:if>
    </body>
</html>
