package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection recuperaConexion() throws SQLException {
        return  DriverManager.getConnection(
                "jdbc:mysql://localhost/control_stock_alura?useTimeZone=true&serverTimeZone=UTC",
                "root",
                "020411");
    }
}
