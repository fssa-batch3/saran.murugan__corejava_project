package day06.practice;


import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestTaskMethod {

	@Test
	public void testValidFindTask() throws Exception {

		ArrayList<Task> taskList = new ArrayList<>();
		taskList.add(new Task("Taskplay", 3));
		taskList.add(new Task("Taskeating", 2));
		taskList.add(new Task("Taskstudying", 1));
		taskList.add(new Task("Tasktakingnotes", 4));
		taskList.add(new Task("Taskexercise", 5));

		boolean findTask = TaskMethod.findTaskByName("Taskplay", taskList);

		Assertions.assertTrue(findTask);

	}

	@Test
	public void testInValidFindTask() {

		try {
			ArrayList<Task> taskList = new ArrayList<>();
			taskList.add(new Task("Taskplay", 3));
			taskList.add(new Task("Taskeating", 2));
			taskList.add(new Task("Taskstudying", 1));
			taskList.add(new Task("Tasktakingnotes", 4));
			taskList.add(new Task("Taskexercise", 5));

			boolean findTask = TaskMethod.findTaskByName("Taskplay11", taskList);

			Assertions.fail("testInValidFindTask failed");
		} catch (Exception ex) {
			Assertions.assertEquals("Not found", ex.getMessage());
		}

	}

}
