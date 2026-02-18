<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:set var="user" value="prit valu"></c:set>
        <c:set var="year" value="2026"></c:set>
        
        <c:out value="Welcome ${user}"></c:out>
    </body>
</html>
