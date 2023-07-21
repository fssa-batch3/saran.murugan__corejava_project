package day11.solved;

import java.sql.*;

public class TestMysqlConnectio {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo1", "root", "123456");
		System.out.println(conn);
		conn.close();

	}
}