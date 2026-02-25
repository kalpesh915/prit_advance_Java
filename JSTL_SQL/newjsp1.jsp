<%-- 
    Document   : newjsp1
    Created on : Feb 25, 2026, 6:16:10 PM
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
        <h1>Hello World!</h1>
        <sql:setDataSource 
    var="db"
    driver="com.mysql.cj.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/jstl_db"
    user="root"
    password="" />
        
        <sql:query var="rs" dataSource="${db}">
    SELECT * FROM student
</sql:query>
    
    <table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>City</th>
</tr>

<c:forEach var="row" items="${rs.rows}">
<tr>
    <td>${row.id}</td>
    <td>${row.name}</td>
    <td>${row.city}</td>
</tr>
</c:forEach>

</table>

    </body>
</html>
