package database_jdbc;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql//127.0.0.1:3306/sagi";

        //establish connection
        Connection conn = DriverManager.getConnection(url,"root"," ");

        // create a statement object
        Statement statement = conn.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from company");

        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
    }
}
