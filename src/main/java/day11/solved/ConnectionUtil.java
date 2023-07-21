package day11.solved;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class ConnectionUtil {
	public static Connection getConnection()  {
		 
        Connection con = null;
        String url = "jdbc:mysql://localhost/YOURDB";
        String userName = "root";
        String passWord = "123456";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, passWord);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to connect to the database");
        }
        
        return con;
        
    }

     
    public static void close(Connection conn , Statement stmt, ResultSet rs){
         
        try
        {
            if ( rs != null ){
                rs.close();
            }
            if ( stmt != null ) {
                ((Connection) stmt).close();
            }
            if ( conn != null ){
                conn.close();
            }
        }
        catch(SQLException e){
             e.printStackTrace();
						 // No need re throw the exception.
        }
        
    }
}
