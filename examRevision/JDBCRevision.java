package com.mycompany.jdbcrevision;

import java.sql.*;

public class JDBCRevision {
    public static void main(String[] args) {
        try{
            //Load DB-specific JDBC driver
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            
            //Getting Connection
            String URL = "jdbc:derby://localhost:1527/school", username = "APP", password = "root123";
            Connection connection = DriverManager.getConnection(URL, username, password);
            
            // Get a Statement object
            Statement statement = connection.createStatement();
            
            // Execute queries and/or updates
            String sqlQuery = "insert into students (id, fname, lname) values (1, 'abc', 'xyz')";
            
            //Read results
            int result = statement.executeUpdate(sqlQuery);
            
            System.out.println(result);
            //Close Statement and Connection objects
            statement.close();
            connection.close();
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Error is "+err);
        }
    }
}
