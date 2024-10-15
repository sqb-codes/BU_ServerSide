package com.employee.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseConnection {
    private static Connection connection;

    private DatabaseConnection() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties props = new Properties();
                props.load(DatabaseConnection.class.getClassLoader().getResourceAsStream("db.properties"));

                String url = props.getProperty("db.url");
                String user = props.getProperty("db.username");
                String password = props.getProperty("db.password");

                connection = DriverManager.getConnection(url, user, password);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
