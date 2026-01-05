package com.mycompany.connectionpool;

import com.zaxxer.hikari.*;
import java.sql.*;

public class ConnectionManager {
    private static final HikariDataSource hikariDataSource;
    
    static {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("org.apache.derby.client.ClientAutoloadedDriver");
        hikariConfig.setJdbcUrl("jdbc:derby://localhost:1527/school");
        hikariConfig.setUsername("root");
        hikariConfig.setPassword("root123");
        
        hikariConfig.setMaximumPoolSize(5);
        
        hikariDataSource = new HikariDataSource(hikariConfig);
    }
    
    public static Connection getConnection() throws SQLException{
        return hikariDataSource.getConnection();
    }
    
    public static void close(){
        if(hikariDataSource != null){
            hikariDataSource.close();
        }
    }
}
