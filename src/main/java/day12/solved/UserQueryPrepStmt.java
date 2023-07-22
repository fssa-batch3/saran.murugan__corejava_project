package day12.solved;

import java.sql.Connection;
import java.sql.PreparedStatement;

import day11.solved.ConnectionUtil;


//Explain in class what is the difference between Statement and PreparedStatement 
public class UserQueryPrepStmt {
	public static void main(String[] args) throws Exception{
		Connection connection = ConnectionUtil.getConnection();
		String query ="INSERT INTO USERS (first_name, last_name, email_id, password, github_username) VALUES ( ?, ?, ?, ?, ? );";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, "bharathwaj");
		pst.setString(2, "soundararajan");
		pst.setString(3, "bharathwaj.soundararajan@ctr.freshworks.com");
		pst.setString(4, "password007");
		pst.setString(5, "bharathwaj");
		System.out.println(pst.toString());
		int rows2 = pst.executeUpdate();
		System.out.println("No of rows inserted :" + rows2 );
		pst.close();
	
	}
	
}