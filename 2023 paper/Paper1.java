package com.mycompany.jdbcproject1;
import java.sql.*;


public class Paper1 {
    public static void main(String[] args) {
        try{
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String URL = "jdbc:derby://localhost:1527/college";
            Connection connection = DriverManager.getConnection(URL, "root", "root123");
            connection.setAutoCommit(false);
            String sqlQuery = "insert into car (cid, name, price) values (?, ?, ?)";
            try{
                PreparedStatement prepared = connection.prepareStatement(sqlQuery);
                
                prepared.setInt(1, 1);
                prepared.setString(2, "Eco-sport");
                prepared.setInt(3, 500000);
                prepared.addBatch();
                
                prepared.setInt(1, 2);
                prepared.setString(2, "Venue");
                prepared.setInt(3, 700000);
                prepared.addBatch();
                
                prepared.setInt(1, 3);
                prepared.setString(2, "Nexon");
                prepared.setInt(3, 800000);
                prepared.addBatch();
                
                prepared.executeBatch();
                
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
