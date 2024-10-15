package com.employee.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

public class DatabaseConnection {

    private static Connection connection;

    // Singleton for DB connection
    private DatabaseConnection() { }

    public static Connection getConnection() throws IOException {
        if (connection == null) {
            try {
                Properties properties = new Properties();
                InputStream input = DatabaseConnection.class.getClassLoader().getResourceAsStream("db.properties");
                properties.load(input);

                String url = properties.getProperty("db.url");
                String user = properties.getProperty("db.user");
                String password = properties.getProperty("db.password");

                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException | IOException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
