package day11.practice;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTaskDAO {
	
	@Test
	public void testValidTask() throws DAOException {
		
		Task t1 = new Task("Complete day12 Practice", "Pending");
		Assertions.assertTrue(TaskDAO.createTask(t1));
		
	}
	
	
	@Test
	public void testInvalidTask() {
		
		try {
			Task t1 = null;
			TaskDAO.createTask(t1);
		}catch(DAOException e) {
			Assertions.assertEquals("Task Obj Can't be Null", e.getMessage());
		}
		
	}

}