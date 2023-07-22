package day12.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day11.practice.DAOException;



public class TestTaskDemo2 {

	@Test
	public void testValidCreateTask() throws DAOException {
		Task task1 = new Task();
		task1.name = "Learning";
		task1.status = "completed";
		Assertions.assertTrue(TaskToDoDemo2.createTask(task1));

	}

	@Test
	public void testInValidCreateTaskStatus() throws DAOException {

		try {
			Task task2 = new Task();
			task2.name = "Learn dbms";
			task2.status = null;
			TaskToDoDemo2.createTask(task2);
		}

		catch (IllegalArgumentException ex) {

			Assertions.assertEquals("Task status cannot null or empty ", ex.getMessage());
		}
	}

	@Test
	public void testInValidCreateTask() throws DAOException {

		try {
			Task task2 = new Task();
			task2.name = "";
			task2.status = "completed";
			TaskToDoDemo2.createTask(task2);
		}

		catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Task name cannot null or empty", ex.getMessage());
		}
	}

	@Test
	public void testInValidUpdateTask() throws DAOException {

		try {
			Task task2 = new Task();
			task2.id = -1;
			task2.name = "playing";
			task2.status = "pending";
			TaskToDoDemo2.updateTask(task2);
		}

		catch (IllegalArgumentException ex) {

			Assertions.assertEquals("Task id cannot be zero and less than 0", ex.getMessage());
		}
	}

	@Test
	public void testValidUpdateTask() throws DAOException {

		Task task1 = new Task();
		task1.id = 1;
		task1.name = "Learningnew";
		task1.status = "completed";
		Assertions.assertTrue(TaskToDoDemo2.updateTask(task1));

	}

	@Test
	public void testValidDeleteTask() throws DAOException {

		Assertions.assertTrue(TaskToDoDemo2.deleteTask(1));

	}

	@Test
	public void testInValidDeleteTask() throws DAOException {

		try {
			TaskToDoDemo2.deleteTask(-1);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Task id cannot be zero and less than 0", ex.getMessage());

		}
	}
}