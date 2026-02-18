<%-- 
    Document   : newjsp5
    Created on : Feb 18, 2026, 7:31:38 PM
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
        <c:forEach var="x" begin="1" end="10" step="1">
            <p>${x}</p>
        </c:forEach>
            
            <%--<c:import url="title.html"></c:import>--%>
    </body>
</html>
