package com.ems.config;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    static Connection connection;

    public static Connection getConnection() throws IOException {
        Properties properties = new Properties();
        properties.load(DatabaseConnection.class.getClassLoader().getResourceAsStream("db.properties"));

        String url = properties.getProperty("db.url");
        String username = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");

        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL Successfully...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
