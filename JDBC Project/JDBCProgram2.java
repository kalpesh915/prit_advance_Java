package com.mycompany.jdbcproject1;

import java.sql.*;

public class JDBCProgram2 {
    public static void main(String[] args) {
        try{
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String URL = "jdbc:derby://localhost:1527/college";
            Connection connection = DriverManager.getConnection(URL, "root", "root123");
            Statement statement = connection.createStatement();
            
            String query = "select * from students";
            
            ResultSet resultSet = statement.executeQuery(query);
            
            // fetch data from resultset
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String fname = resultSet.getString("fname");
                String lname = resultSet.getString("lname");
                String city = resultSet.getString("city");
                
                System.out.println("Welcome "+fname + " "+lname+" to "+city+" Your id is "+id);
            }
            
            connection.close();
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Error is "+err);
        }
    }
}
