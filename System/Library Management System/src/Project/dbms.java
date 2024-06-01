package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbms {

    public static Connection c;
    public static String dbs;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/";
            String un = "root";
            String pw = "1234";
            c = DriverManager.getConnection(url+"LMS"+"?useSSL=false",un,pw);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    public static void iud(String query)throws Exception{
        Statement s = c.createStatement();
        int x = s.executeUpdate(query);
        System.out.println(x);
    }
    public static ResultSet search(String query)throws Exception{
        Statement s = c.createStatement();
        ResultSet r = s.executeQuery(query);
        return r;
    }
    

    public static Connection getConn() 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
