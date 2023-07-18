package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;


class Task1 implements Comparable<Task1> {
	
	private int id; 
	private String name;
	private LocalDate deadline;
	private int priority;
	
	Task1(int id, String name, String deadline, int priority) {
		this.id = id;
		this.name = name;
		LocalDate date = LocalDate.parse(deadline);
		this.deadline = date;
		this.priority = priority;
	}
	@Override
	public int compareTo(Task1 t) {//0...1...-1
		if (deadline.equals(t.deadline)) {
			
			if (this.priority == t.priority) {
				return 0;
			} else if (this.priority > t.priority) {
				return -1;
			} else {
				return 1; 
			}
		} else if (deadline.compareTo(t.deadline) > 0) {
			return 1; 
		} else {
			return -1;
		}
	} 
	public String toString() {
		String out = "Task id : " + this.id + " || Task name : " + this.name + " || Task DeadLine :" + deadline
				+ " || Task priority : " + priority + "\n";
		return out;
	}
}
public class SortingTaskWithPriority {
	public static void main(String[] args) {
		ArrayList<Task1> taskArray = new ArrayList<Task1>();
		taskArray.add(new Task1(3, "Coding", "2022-10-22", 5));
		taskArray.add(new Task1(3, "Coding", "2022-10-22", 4));
		taskArray.add(new Task1(5, "Product Design", "2022-10-01", 6));
		taskArray.add(new Task1(1, "Software Design", "2022-10-07", 7));
		taskArray.add(new Task1(3, "Coding", "2022-10-22", 3));
		Collections.sort(taskArray);
		System.out.println(taskArray);
	}
}