package com.mycompany.jdbcrevision;

import java.io.*;
import java.sql.*;
import java.util.*;

public class JDBCRevision8 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        InputStream fin = null;
        // The file you want to insert into the database
        String imagePath = "C://Users//hp//Desktop/metal.jpg"; 
        int imageId = 1;
        try{
            
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String URL = "jdbc:derby://localhost:1527/school", username = "APP", password = "root123";
            Connection connection = DriverManager.getConnection(URL, username, password);
            
            File imageFile = new File(imagePath);
            fin = new FileInputStream(imageFile);
            
            PreparedStatement preparedStatement = connection.prepareStatement("insert into images (id, imagedata) values (?, ?)");
            
            preparedStatement.setInt(1, imageId);
            preparedStatement.setBinaryStream(2, fin, (int)imageFile.length());
            
            int result = preparedStatement.executeUpdate();
            
            System.out.println("Result is "+result);
            
            preparedStatement.close();
            connection.close();
        }catch(ClassNotFoundException | FileNotFoundException | SQLException err){
            System.out.println("Error is "+err);
        }
    }
}
