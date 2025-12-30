package com.mycompany.jdbcrevision;

import java.sql.*;
import java.util.Scanner;

public class JDBCRevision7 {
    public static void main(String[] args) {
        try{
            
            Scanner scanner = new Scanner(System.in);
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String URL = "jdbc:derby://localhost:1527/school", username = "APP", password = "root123";
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            connection.setAutoCommit(false);
            
            try{
                statement.addBatch("insert into students (id, fname, lname) values (11, 'aa', 'bb')");
                statement.addBatch("insert into students (id, fname, lname) values (12, 'aa', 'bb')");
                statement.addBatch("insert into students (id, fname, lname) values (13, 'aa', 'bb')");
                statement.addBatch("insert into students (id, fname, lname) values (14, 'aa', 'bb')");
                statement.addBatch("insert into students (id, fname, lname) values (15, 'aa', 'bb')");
                statement.addBatch("insert into students (id, fname, lname) values (16, 'aa', 'bb')");
                statement.addBatch("insert into students (id, fname, lname) values (17, 'aa', 'bb')");
                statement.addBatch("insert into students (id, fname, lname) values (18, 'aa', 'bb')");
                statement.addBatch("insert into students (id, fname, lname) values (19, 'aa', 'bb')");
                statement.addBatch("insert into students (id, fname, lname) values (20, 'aa', 'bb')");
                
                statement.executeBatch();
                connection.commit();
            }catch(SQLException err){
                System.out.println("Error is "+err);
                connection.rollback();
            }
            
            statement.close();
            connection.close();
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Error is "+err);
        }
    }
}
