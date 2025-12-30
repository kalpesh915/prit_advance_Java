package com.mycompany.jdbcrevision;

import java.sql.*;

public class JDBCRevision4 {
    public static void main(String[] args) {
        try{
            
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String URL = "jdbc:derby://localhost:1527/school", username = "APP", password = "root123";
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            
            String sqlQuery = "select * from students";
            
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            ResultSetMetaData rsMeta = resultSet.getMetaData();
            
            System.out.println(rsMeta.getTableName(1));
            System.out.println(rsMeta.getColumnCount());
            
            statement.close();
            connection.close();
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Error is "+err);
        }
    }
}
