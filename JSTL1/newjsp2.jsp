<%-- 
    Document   : newjsp2
    Created on : Feb 17, 2026, 5:09:30 PM
    Author     : Kalpesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <!--declaration of username variable....  -->
        <%! String username="Geeks"; %>
        <%! int year=2026; %>
        
        <!--In expression tag a string is initialised as Geeks -->
        <%="Hello "+username%>
        
        
    </body>
</html>
