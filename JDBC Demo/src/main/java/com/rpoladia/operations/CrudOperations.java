package com.rpoladia.operations;

import java.sql.*;

public class CrudOperations {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "password";
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to database successfully");

        Statement stmt = conn.createStatement();
        //Execute method is used for insert statement execution.
        //boolean status = stmt.execute("insert into student values(5, 'Poladia', 96)");
        //System.out.println("Status: " + status);
        //Status will be false!!!

        //boolean status = stmt.execute("update student set sname='Poladia Family' where sid=5");
        //System.out.println("Status: " + status);

        boolean status = stmt.execute("delete from student where sid=5");
        System.out.println("Status: " + status);

        conn.close();
        System.out.println("Connection closed successfully");
    }
}
