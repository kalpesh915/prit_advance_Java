<%-- 
    Document   : newjsp2
    Created on : Feb 25, 2026, 6:29:09 PM
    Author     : Kalpesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="sql" uri="jakarta.tags.sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSTL SQL Tag Example</h1>
        <sql:setDataSource 
            var="db"
            driver="com.mysql.cj.jdbc.Driver"
            url="jdbc:mysql://localhost:3306/224mysql"
            user="root"
            password=""></sql:setDataSource>
        
        <sql:query var="rs" dataSource="${db}">select * from students</sql:query>
        
        <c:forEach var="row" items="${rs.rows}">
            <p>Welcome ${row.id} :  ${row.fname} ${row.lname} to ${row.city}</p>
        </c:forEach>
    </body>
</html>
