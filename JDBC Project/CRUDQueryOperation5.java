package com.mycompany.jdbcproject1;

import java.sql.*;

public class CRUDQueryOperation5 {
    public static void main(String[] args) {
        
        try{
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String url = "jdbc:derby://localhost:1527/college";
            
            Connection connection = DriverManager.getConnection(url, "root", "root123");
            
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            connection.setAutoCommit(false);
            try{
                statement.addBatch("insert into students (id, fname, lname, city) values (1, 'a', 'b', 'c')");
                statement.addBatch("insert into students (id, fname, lname, city) values (1, 'a', 'b', 'c')");
                statement.addBatch("insert into students (id, fname, lname, city) values (1, 'a', 'b', 'c')");
                statement.addBatch("insert into students (id, fname, lname, city) values (1, 'a', 'b', 'c')");
                statement.addBatch("insert into students (id, fname, lname, city) values (1, 'a', 'b', 'c')");
                statement.addBatch("insert into students (id, fname, lname, city) values (1, 'a', 'b', 'c')");
                statement.addBatch("insert into students (id, fname, lname, city) values (1, 'a', 'b', 'c')");
                statement.addBatch("insert into students (id, fname, lname, city) values (1, 'a', 'b', 'c')");
                
                statement.executeBatch();
                connection.commit();
            }catch(Exception err){
                System.out.println("Error is "+err);
                connection.rollback();
            }
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Error is "+err);
        }
    }
}
