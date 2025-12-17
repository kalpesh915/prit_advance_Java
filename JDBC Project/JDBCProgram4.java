package com.mycompany.jdbcproject1;
import java.sql.*;
import java.util.Scanner;
public class JDBCProgram4 {
    public static void main(String[] args) {
        try{
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String url = "jdbc:derby://localhost:1527/college";
            Connection connection = DriverManager.getConnection(url, "root", "root123");
            Statement statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Enter ID ");
            int id = scanner.nextInt();
            System.out.println("Enter First name ");
            String fname = scanner.next();
            System.out.println("Enter Last name ");
            String lname = scanner.next();
            System.out.println("Enter City name ");
            String city = scanner.next();
            
            String query = "insert into students (id, fname, lname, city) values ("+id+",'"+fname+"', '"+lname+"', '"+city+"')";
            int response = statement.executeUpdate(query);
            System.out.println(response);
            
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Error is "+err);
        }
    }
}
