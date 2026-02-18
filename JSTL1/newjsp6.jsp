<%-- 
    Document   : newjsp6
    Created on : Feb 18, 2026, 7:34:53 PM
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
        
        <c:redirect url="https://www.google.com">
            <c:param name="q" value="pritvalu"></c:param>
        </c:redirect>
    </body>
</html>
