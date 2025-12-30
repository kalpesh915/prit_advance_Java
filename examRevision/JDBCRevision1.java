package com.mycompany.jdbcrevision;

import java.sql.*;
import java.util.Scanner;

public class JDBCRevision1 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            
            //Load DB-specific JDBC driver
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            
            //Getting Connection
            String URL = "jdbc:derby://localhost:1527/school", username = "APP", password = "root123";
            Connection connection = DriverManager.getConnection(URL, username, password);
            
            // Get a Statement object
            Statement statement = connection.createStatement();
            
            System.out.println("Enter ID ");
            int id = scanner.nextInt();
            
            System.out.println("Enter First Name ");
            String fname = scanner.next();
            
            System.out.println("Enter Last Name ");
            String lname = scanner.next();
            
            // Execute queries and/or updates
            String sqlQuery = "insert into students (id, fname, lname) values ("+id+", '"+fname+"', '"+lname+"')";
            
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
