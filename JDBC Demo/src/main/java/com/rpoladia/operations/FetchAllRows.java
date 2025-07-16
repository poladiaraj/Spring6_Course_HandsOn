package com.rpoladia.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchAllRows {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "password";
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to database successfully");

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.print(rs.getInt(3));
            System.out.println();
        }

        conn.close();
        System.out.println("Connection closed successfully");
    }
}
