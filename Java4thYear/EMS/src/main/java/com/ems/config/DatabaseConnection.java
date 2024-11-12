package com.ems.config;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    private static Connection connection;

    public static Connection getConnection() throws IOException {

        Properties prop = new Properties();
        prop.load(DatabaseConnection.class.getClassLoader().getResourceAsStream("db.properties"));

        final String URL = prop.getProperty("db.URL");
        final String USERNAME = prop.getProperty("db.USERNAME");
        final String PASSWORD = prop.getProperty("db.PASSWORD");

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection established...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
