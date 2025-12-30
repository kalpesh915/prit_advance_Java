package com.mycompany.jdbcrevision;

import java.sql.*;
import java.util.Scanner;

public class JDBCRevision2 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String URL = "jdbc:derby://localhost:1527/school", username = "APP", password = "root123";
            Connection connection = DriverManager.getConnection(URL, username, password);
            
            
            String sqlQuery = "insert into students (id, fname, lname) values (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            
            System.out.println("Enter ID ");
            int id = scanner.nextInt();
            
            System.out.println("Enter First Name ");
            String fname = scanner.next();
            
            System.out.println("Enter Last Name ");
            String lname = scanner.next();
            
            statement.setInt(1, id);
            statement.setString(2, fname);
            statement.setString(3, lname);
            
            //Read results
            int result = statement.executeUpdate();
            
            System.out.println(result);
            //Close Statement and Connection objects
            statement.close();
            connection.close();
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Error is "+err);
        }
    }
}
