package com.mycompany.connectionpool;

import java.sql.*;

public class ConnectionPool {

    public static void main(String[] args) {
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
        try{
            connection = ConnectionManager.getConnection();
            
            if(connection != null){
                String sqlQuery = "select * from students";
                preparedStatement = connection.prepareStatement(sqlQuery);
                
                resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){
                    System.out.println("Welcome "+resultSet.getString("fname")+" "+resultSet.getString("lname"));
                }
            }else{
                System.out.println("Failed to get Connection");
            }
            
        }catch(Exception err){
            System.out.println("Error is "+err);
        }finally{
           // connection.close();
        }
    }
}
