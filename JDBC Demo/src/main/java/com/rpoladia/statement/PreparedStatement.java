package com.rpoladia.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PreparedStatement {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "password";
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to database successfully");

        int sid = 6;
        String sname = "Family";
        int marks = 100;

        //Prepared statements can also be used to cache the queries in database!!!
        String sql = "insert into student values(?,?,?)";

        java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, sid);
        pstmt.setString(2, sname);
        pstmt.setInt(3, marks);

        pstmt.executeUpdate();

        conn.close();
        System.out.println("Connection closed successfully");
    }
}
