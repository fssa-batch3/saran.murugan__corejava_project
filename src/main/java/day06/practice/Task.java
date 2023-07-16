package day06.practice;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
	public String taskName;

	public int priority;

	public Task(String taskName, int priority) {
		 validatetaskName (taskName);
		 validatetaskpriority(priority);
		this.taskName = taskName;
		this.priority = priority;
	}
	
	
	public static boolean  validatetaskName (String taskName)throws IllegalArgumentException {
		if(taskName==null || taskName.isEmpty()) {
			throw new IllegalArgumentException("TaskName cannot be null or empty");
		}
		String nameregex = "^[a-zA-Z]{2,200}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(taskName);
		Boolean isMatch = matcher.matches();



		 if (!isMatch) {
			throw new IllegalArgumentException("The  task name should be  minimum 2 letters and maximum 200 letters");

		}
		 return true;

		
	}
	public static boolean  validatetaskpriority(int priority)throws IllegalArgumentException {
		if(priority<=0) {
			throw new IllegalArgumentException("InValid priority");
		}
		return true;
		
	}
	public static void main(String[] args) {

		ArrayList<Task> taskList = new ArrayList<>();
		taskList.add(new Task("Taskplaycricket", 3));
		taskList.add(new Task("Taskjogging", 2));
		taskList.add(new Task("Taskstudying", 1));
		taskList.add(new Task("Taskplayingpubg", 4));
		taskList.add(new Task("Taskexercise", 5));

		for (Task task : taskList) {
			System.out.println("TaskName " + task.taskName);
			System.out.println("Taskpriority " + task.priority);

			System.out.println();

		}
	}
  

}
