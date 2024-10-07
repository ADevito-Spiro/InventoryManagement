package org.example;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Database
{
    static final String DB_URL = "jdbc:mysql://68.52.195.235:3306/InventoryManagement";
    static final String USER = "Project";
    static final String PASS = "HackNCody";

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
