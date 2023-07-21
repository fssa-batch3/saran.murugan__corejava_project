package day11.solved;


import java.sql.Connection;
import java.sql.Statement;

public class UserInsertQuery {
	public static void main(String[] args) throws Exception {       
        
        // Step 01: Get connection
        Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);

        // Step 02: Create a Statement
        Statement stmt = connection.createStatement();
         
        // Step 03: Execute Insert Query
        String query ="INSERT INTO Users (user_name, email_id, additional_info, password) VALUES (\"parameshwari\",\"parameshwari@.freshworks.com\",\"FSSA Studentd\", \"password007\")";
        int rows = stmt.executeUpdate(query);
        System.out.println("No of rows inserted :" + rows );
  
        		 
         
        //Step 04: close the connection resources       
        stmt.close();
        connection.close();
         
         
         
    }
}