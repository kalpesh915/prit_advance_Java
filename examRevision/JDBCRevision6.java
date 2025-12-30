package com.mycompany.jdbcrevision;

import java.sql.*;

public class JDBCRevision6 {
    public static void main(String[] args) {
        try{
            
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String URL = "jdbc:derby://localhost:1527/school", username = "APP", password = "root123";
            Connection connection = DriverManager.getConnection(URL, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("select * from students where id = ?");
            
            preparedStatement.setInt(1, 2);
            //preparedStatement.setInt(1, "1 = 1");
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                System.out.println("Welcome "+resultSet.getString(2)+" "+resultSet.getString(3));
            }
            
            preparedStatement.close();
            connection.close();
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Error is "+err);
        }
    }
}
