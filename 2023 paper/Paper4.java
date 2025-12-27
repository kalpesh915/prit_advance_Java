package com.mycompany.jdbcproject1;
import java.sql.*;


public class Paper4 {
    public static void main(String[] args) {
        try{
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String URL = "jdbc:derby://localhost:1527/college";
            Connection connection = DriverManager.getConnection(URL, "root", "root123");
            connection.setAutoCommit(false);
            String sqlQuery1 = "select * from students1 where marks > ? or 1 = 1";
            try{
                PreparedStatement prepared = connection.prepareStatement(sqlQuery1);
                prepared.setInt(1, 80);
                ResultSet resultSet = prepared.executeQuery();
                
                while (resultSet.next()) {                    
                    System.out.println("ID : "+resultSet.getInt(1)+ " Marks : "+resultSet.getInt(2));
                }
                
                connection.commit();
                connection.close();
            }catch( SQLException err){
                connection.rollback();
                System.out.println("Error is "+err);
            }
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Error is "+err);
        }
    }
}
