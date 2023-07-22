package day12.solved;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import day11.solved.ConnectionUtil;
 

public class UserQuery {
 
    public static void main(String[] args) throws Exception {       
         
        
        Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);
         
        Statement stmt = connection.createStatement();
         
        // Step 03: Execute Insert Query
        String query ="INSERT INTO USERS (first_name, last_name, email_id, password, github_username) VALUES (\"Unknown\", \"Unknown\", \"unknown@gmail.com\", \"password007\", \"unkonwn\")";
        int rows = stmt.executeUpdate(query);
        System.out.println("No of rows inserted :" + rows );
         
        //Step 04: Execute SELECT Query
        final String selectQuery = "SELECT id,first_name,email_id FROM USERS";
         
        //Step 05: Get the resultset
        ResultSet rs = stmt.executeQuery(selectQuery);
         
        //Step 06: Iterate the result
        while ( rs.next()) {
        	int userId = rs.getInt("id");            
        	String userName = rs.getString("first_name");
            String emailID = rs.getString("email_id");
             
            System.out.println("UserId:" + userId +", UserName:" + userName + ", EMAIL ID:" + emailID);
        }
         
        //Step 07: close the connection resources       
        rs.close();
        stmt.close();
        connection.close();
         
         
         
    }
     
}
