package com.mycompany.jdbcproject1;
import java.sql.*;


public class Paper3 {
    public static void main(String[] args) {
        try{
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String URL = "jdbc:derby://localhost:1527/college";
            Connection connection = DriverManager.getConnection(URL, "root", "root123");
            connection.setAutoCommit(false);
            String sqlQuery1 = "insert into students1 (id, marks) values(?, ?)";
            try{
                PreparedStatement prepared = connection.prepareStatement(sqlQuery1);
                
                prepared.setInt(1, 11);
                prepared.setInt(2, 83);
                
                prepared.execute();
                
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
