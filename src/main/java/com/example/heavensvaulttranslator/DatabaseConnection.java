package com.example.heavensvaulttranslator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/heavens_vault_translator";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
