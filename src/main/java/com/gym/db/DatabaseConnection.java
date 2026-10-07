package com.gym.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DatabaseConnection {
    private DatabaseConnection() {
    }

    public static Connection connect(String url, String username, String password)
            throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
