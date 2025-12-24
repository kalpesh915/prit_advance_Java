package com.mycompany.jdbcproject1;

import java.sql.*;

public class CRUDQueryOperation1 {
    public static void main(String[] args) {
        
        try{
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String url = "jdbc:derby://localhost:1527/college";
            
            Connection connection = DriverManager.getConnection(url, "root", "root123");
            
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.setMaxRows(2);
            
            String SqlQuery = "select * from students";
            ResultSet resultSet = statement.executeQuery(SqlQuery);
            
            
            while(resultSet.next()){
                System.out.println("Welcome "+resultSet.getString("fname")+" "+resultSet.getString("lname")+" Your ID is "+resultSet.getInt("id"));
            }
            
            /*resultSet.previous();
            resultSet.previous();
            resultSet.previous();*/
            
            //resultSet.first();
            
            //resultSet.absolute(2);
            //resultSet.relative(3);
            
            /*while(resultSet.next()){
                System.out.println("Welcome "+resultSet.getString("fname")+" "+resultSet.getString("lname"));
            }*/
            
            //System.out.println("Connected");
            connection.close();
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Error is "+err);
        }
    }
}
