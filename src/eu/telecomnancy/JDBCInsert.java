/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.telecomnancy;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author charoy
 */
public class JDBCInsert {

    static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static final String DB_URL = "jdbc:derby://localhost/mydb"; // il faut créer cette base de donnée

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement stmt = null;

        //STEP 2: Register JDBC driver
        Class.forName(JDBC_DRIVER);

        //STEP 3: Open a connection
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);

        //STEP 4: Execute a query
        System.out.println("Creating statement...");

        String sql = "INSERT INTO Myentity "
                + "VALUES ()";
        stmt = conn.createStatement();
        stmt.executeUpdate(
                "insert into MYENTITY "
                + "values(4, 'tagada')");

        conn.close();

        System.out.println("Goodbye!");
    }
}

