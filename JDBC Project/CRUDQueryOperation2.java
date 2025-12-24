package com.mycompany.jdbcproject1;

import java.sql.*;

public class CRUDQueryOperation2 {
    public static void main(String[] args) {
        
        try{
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String url = "jdbc:derby://localhost:1527/college";
            
            Connection connection = DriverManager.getConnection(url, "root", "root123");
            
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            
            String SqlQuery = "select * from students";
            ResultSet resultSet = statement.executeQuery(SqlQuery);
            
            resultSet.next();
            resultSet.updateString("fname", "PRIT");
            resultSet.updateRow();
            resultSet.previous();
            resultSet.next();
            System.out.println(resultSet.getString("fname"));
            connection.commit();
            connection.close();
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Error is "+err);
        }
    }
}
