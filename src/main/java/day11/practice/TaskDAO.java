package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import day11.solved.ConnectionUtil;

class Task {
	int id;
	String name;
	String status;
	
	Task(String name, String status){

		this.name = name;
		this.status = status;
	}
	
}


class TaskDAO {
	
	public static boolean createTask(Task task) throws DAOException {

		
		if(task == null) {
			throw new DAOException("Task Obj Can't be Null");
		}
		
		String url = "jdbc:mysql://localhost:3306/task";
		String userName = "root";
		String passWord = "123456";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userName, passWord);
		}catch(SQLException  e) {
			throw new DAOException("Can't Create Connection");
		}
		
		String query = "INSERT INTO task(name, status) values (?,?)";
		
		
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, task.name);
			pst.setString(2, task.status);
			pst.executeUpdate();
		}catch(SQLException e) {
			throw new DAOException("Can't Run Prepared Statement");
		}
		
		ConnectionUtil.close(con, null, null);
		
		System.out.println("Task Completed");
		
		return true;
		
		
	} 
	
	public static void main(String[] args) throws DAOException {

		Task t1 = new Task("Learn JDBC", "Completed");
		
		try {
			createTask(t1);
		}catch(DAOException e) {
			throw new DAOException(e.getMessage());
		}
		
	}

}