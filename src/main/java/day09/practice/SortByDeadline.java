package day09.practice;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Task {
    private int id;
    private String name;
    private LocalDate deadline;

    public Task(int id, String name, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + deadline;
    }
}

public class SortByDeadline {
    public static void main(String[] args) {
       
    	
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(4, "Coding", LocalDate.parse("2022-10-22")));
        tasks.add(new Task(5, "Product Design", LocalDate.parse("2022-10-02")));
        tasks.add(new Task(1, "Software Design", LocalDate.parse("2022-10-07")));
        tasks.add(new Task(3, "Testing", LocalDate.parse("2022-10-22")));

        // Sorting the tasks by deadline
        Collections.sort(tasks, Comparator.comparing(Task::getDeadline));

        // Print the sorted tasks
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
