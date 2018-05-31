/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Le Hoang Anh
 */
public class connectionHandle {
      private Connection connection;
    private final String CONNECTION_PREFIX = "jdbc:mysql://localhost:3306/";
    private final String DATABASE_NAME = "form";
    private final String UTF8_CONFIG = "";
    private final String USERNAME = "root";
    private final String PASSWORD = "";

    private static entity.connectionHandle connectionHandle;

    public static entity.connectionHandle getInstance() {
        if (null == connectionHandle) {
            connectionHandle = new entity.connectionHandle();
        }
        return connectionHandle;
    }

    public Connection getConnection() throws SQLException {
        if (null == connection || connection.isClosed()) {
            connection = DriverManager.getConnection(CONNECTION_PREFIX + DATABASE_NAME + UTF8_CONFIG, USERNAME, PASSWORD);
        }
        return connection;
    }

    public void closeConnection() throws SQLException {
        if (connection != null && connection.isClosed()) {
            connection.close();
        }
    }
}
