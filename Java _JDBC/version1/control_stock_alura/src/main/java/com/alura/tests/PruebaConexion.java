package com.alura.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/control_stock_alura?useTimeZone=true&serverTimeZone=UTC",
                "root",
                "020411");
        System.out.println("Cerrando la conexión");
        con.close();
    }
}
