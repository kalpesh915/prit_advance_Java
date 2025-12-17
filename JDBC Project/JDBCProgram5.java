package com.mycompany.jdbcproject1;
import java.sql.*;
import java.util.Scanner;
public class JDBCProgram5 {
    public static void main(String[] args) {
        try{
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            String url = "jdbc:derby://localhost:1527/college";
            Connection connection = DriverManager.getConnection(url, "root", "root123");
            PreparedStatement prepared = connection.prepareStatement("insert into students (id, fname, lname, city) values (?, ?, ?, ?)");
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Enter ID ");
            int id = scanner.nextInt();
            System.out.println("Enter First name ");
            String fname = scanner.next();
            System.out.println("Enter Last name ");
            String lname = scanner.next();
            System.out.println("Enter City name ");
            String city = scanner.next();
            
            prepared.setInt(1, id);
            prepared.setString(2, fname);
            prepared.setString(3, lname);
            prepared.setString(4, city);
            
            if(prepared.execute() == true){
                System.out.println("Record Created");
            }else{
                System.out.println("Record Not Created");
            }
            
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Error is "+err);
        }
    }
}
