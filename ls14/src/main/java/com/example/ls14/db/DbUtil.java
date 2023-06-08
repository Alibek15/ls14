package com.example.ls14.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DbUtil {
    private static final Logger logger = Logger.getLogger("DbUtil");
    private static Connection connection;

    public static void connect(){
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");
            logger.info("CONNECTED");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
