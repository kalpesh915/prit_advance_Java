<%-- 
    Document   : newjsp4
    Created on : Feb 18, 2026, 7:26:26 PM
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
        <c:set var="x" value="10"></c:set>
        <c:set var="user" value="prit"></c:set>
        
        <h1>Welcome ${user}</h1>
        <p>${x * x}</p>
        
        <c:remove var="user"></c:remove>
        <h1>Welcome ${user}</h1>
        
        <c:out value="Welcome to world of JSTL"></c:out>
        <c:out value="${x}"></c:out>
    </body>
</html>
