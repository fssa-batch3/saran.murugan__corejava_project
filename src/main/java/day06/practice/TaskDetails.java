package day06.practice;

import java.util.ArrayList;

public class TaskDetails {
    public static void main(String[] args) {
       
        ArrayList<Task> taskList = new ArrayList<>();

        
        taskList.add(new  Task("Task 1", "Description 1"));
        taskList.add(new  Task("Task 2", "Description 2"));
     
        for (Task task : taskList) {
            System.out.println("Task Name: " + task.name);
            System.out.println("Task Description: " + task.description);
           
         
        }
    }
}
