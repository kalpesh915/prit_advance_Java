<%-- 
    Document   : login
    Created on : Jan 27, 2026, 5:48:37 PM
    Author     : Kalpesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login" method="post">
            Username: <input type="text" name="uname" required /><br><br>
            Password: <input type="password" name="pass" required /><br><br>
            <input type="submit" value="Login" />
        </form>
    </body>
</html>
