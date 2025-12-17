package com.mycompany.jdbcproject1;
import java.sql.*;
public class JDBCProject1 {
    public static void main(String[] args) {
        try{
            // Load Required Driver
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            
            // Create Connection
            String URL = "jdbc:derby://localhost:1527/college";
            Connection connection = DriverManager.getConnection(URL, "root", "root123");
            
            System.out.println("Connected");
            //connection.setAutoCommit(true);
            //connection.setAutoCommit(false);
            
            // Statement
            Statement statement = connection.createStatement();
            
            String query = "insert into students (id, fname, lname, city) values (4, 'Prit', 'Valu', 'Rajkot')";
            int result = statement.executeUpdate(query);
            System.out.println(result);
            //connection.commit();
            // Close the connection
            connection.close();
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Error is "+err); 
        }
    }
}
