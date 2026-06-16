package org.example.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

import static java.sql.DriverManager.*;

public class DMConnection {

    public static Connection connect() {
        try {
            return getConnection(
                    DBConnectionConfig.DATABASE_URL,
                    DBConnectionConfig.USERNAME,
                    DBConnectionConfig.PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
