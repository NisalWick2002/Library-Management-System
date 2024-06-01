/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;

/**
 *
 * @author Nisal
 */
public class dbConnection {

    private static Connection conn;

    public static Connection getMyConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/";
            String un = "root";
            String pw = "1234";
            conn = DriverManager.getConnection(url + "LMS" + "?useSSL=false", un, pw);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return conn;
    }
}
