package day11.solved;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ResuableTestConnection {
	public static void main(String[] args) throws SQLException {
		 
        Connection connection = ResuableTestConnection.getConnection();     
        System.out.println(connection);
        connection.close();
 
    }
 
    public static Connection getConnection() {
         
        Connection connection  = null;
        
        try
        {
   
         
             String url = "jdbc:mysql://localhost:3306/jdbc_demo1";
             connection = DriverManager.getConnection(url,"root", "123456");
         
        } catch (Exception e) {         
            e.printStackTrace();
            throw new RuntimeException("Unable to connect to the database");
        }
        
        return connection;
       
    }
    
}
