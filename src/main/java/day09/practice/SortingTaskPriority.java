package day09.practice;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortingTaskPriority implements Comparable<SortingTaskPriority> {

	private int id;
	private String name;
	private LocalDate deadline;
	private int priority;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	
	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public SortingTaskPriority(int id, String name, LocalDate deadline,int priority) {
		this.priority=priority;
		this.id = id;
		this.name = name;
		this.deadline = deadline;
		
	}
	




	@Override
	public int hashCode() {
		return Objects.hash(deadline, id, name, priority);
	}

@Override
	
	public int compareTo(SortingTaskPriority o) {

		if (deadline.equals(o.getDeadline())) {
		
			
			if(priority==o.priority) {
				return 0;
			}
			else if(priority<o.priority) {
				return -1;
			}
			else {
				return 1;
			}
		} else {
			if (deadline.isAfter(o.getDeadline())) {
				return 1;
			} else {
				return -1;
			}
			// return ( this.balance > o.getBalance()) ? 1: -1;
		}
	}

	@Override
	public String toString() {
		return "SortingTaskPriority [id=" + id + ", name=" + name + ", deadline=" + deadline + ", priority=" + priority
				+ "]";
	}

	public static ArrayList<SortingTaskPriority> sortPriority(ArrayList<SortingTaskPriority> taskList)throws IllegalArgumentException {
		
		
		if(taskList==null) {
			throw new IllegalArgumentException("The array cannot be empty");
			
		}
		Collections.sort(taskList);
	for(SortingTaskPriority task:taskList) {
		
		System.out.println(task);
		
	}
	return taskList;

	}
	
	public static void main(String[] args) {
		
		ArrayList<SortingTaskPriority> taskList = new ArrayList<>();

		taskList.add(new SortingTaskPriority(1, "taseat", LocalDate.of(2023, 7, 19),2));
		taskList.add(new SortingTaskPriority(5, "tasklearn", LocalDate.of(2023, 7, 11),1));
		taskList.add(new SortingTaskPriority(2, "taskplay", LocalDate.of(2023, 7, 15),2));
		taskList.add(new SortingTaskPriority(3, "tasklearn", LocalDate.of(2023, 7, 17),3));
		taskList.add(new SortingTaskPriority(3, "tasklearn1", LocalDate.of(2023, 7, 17),1));
//		System.out.println(taskList);
		sortPriority(taskList);
		
	}
	

	

}