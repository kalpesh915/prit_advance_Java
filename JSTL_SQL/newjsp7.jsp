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

        <sql:transaction dataSource="${db}">
            <sql:update var="count">
                delete from students where id <= ?
                <sql:param value="25"></sql:param>
            </sql:update>

            <sql:update var="count">
                update students set city = 'bhuj' where id = 36
            </sql:update>

            <sql:update var="count">
                update students set city = 'bharuch' where id = 40
            </sql:update>
        </sql:transaction>
            </body>
        </html>
