package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class FindTaskName {
	static boolean findTaskByName(String name, List<Task> tasks) {

		for (Task value : tasks) {

			if (tasks.equals(name)) {
				System.out.println("successfully find");
				return true;

			}
		}
		return false;

	}

	public static void main(String[] args) {

		List<Task> taskList = new ArrayList<>();

		taskList.add(new Task("Task 1", "Description 1"));
		taskList.add(new Task("Task 2", "Description 2"));

		FindTaskName.findTaskByName("Task 1", taskList);

	}
}
