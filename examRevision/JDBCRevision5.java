package com.mycompany.jdbcrevision;

import java.sql.*;

public class JDBCRevision5 {
    public static void main(String[] args) {
        try{
            
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String URL = "jdbc:derby://localhost:1527/school", username = "APP", password = "root123";
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            
            //String sqlQuery = "select * from students where id = 2";
            String sqlQuery = "select * from students where id = 2 or 1 = 1";
            
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            while(resultSet.next()){
                System.out.println("Welcome "+resultSet.getString(2)+" "+resultSet.getString(3));
            }
            
            statement.close();
            connection.close();
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Error is "+err);
        }
    }
}
