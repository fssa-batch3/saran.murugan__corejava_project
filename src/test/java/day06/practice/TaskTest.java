package day06.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

	
	@Test
	public void testValidTask() {

		Assertions.assertTrue(Task.validatetaskName("Taskplay"));

	}

	@Test
	public void testInValidTask() {

		try {
			Task.validatetaskName(null);
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("TaskName cannot be null or empty", ex.getMessage());
		}

		try {
			Task.validatetaskName("a");
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The  task name should be  minimum 2 letters and maximum 200 letters", ex.getMessage());
		}

	}
	
	
	
	
	
	
	@Test
	public void testValidpriority() {

		Assertions.assertTrue(Task.validatetaskpriority(5));

	}

	@Test
	public void testInValidpriority() {

		try {
			Task.validatetaskpriority(0);
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("InValid priority", ex.getMessage());
		}

	

	}

}
