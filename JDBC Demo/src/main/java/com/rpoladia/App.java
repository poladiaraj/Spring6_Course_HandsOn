package com.rpoladiaß;

//Step 1. Import the package
import java.sql.*;

public class App 
{
    public static void main( String[] args ) throws Exception {
        //System.out.println( "Hello World!" );
        /*
        7 steps:
        1. Import the package
        2. Load and register
        3. Create connection
        4. Create statement
        5. Execute statement
        6. Process results
        7. Close
         */

        //Step 2. Load and register - This is optional in modern day practice
        Class.forName("org.postgresql.Driver");

        //Step 3. Create connection
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "password";
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to database successfully");

        //Step 4. Create statement
        String query = "select sname from student where sid=1";
        Statement stmt = conn.createStatement();

        //Step 5. Execute statement
        ResultSet rs = stmt.executeQuery(query);

        //Step 6. Process results
        System.out.println(rs.next()); //This required as the pointer is always before the actual data.
        System.out.println(rs.getString("sname"));

        //Step 7. Close connection
        conn.close();
        System.out.println("Connection closed successfully");
    }
}
