package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestTaskPriority {
	
	

	@Test

	public void testValidarraySort() {

		ArrayList<SortingTaskPriority> taskList = new ArrayList<>();
	
		taskList.add(new SortingTaskPriority(1, "taseat", LocalDate.of(2023, 7, 19),2));
		taskList.add(new SortingTaskPriority(5, "tasklearn", LocalDate.of(2023, 7, 11),1));
		taskList.add(new SortingTaskPriority(2, "taskplay", LocalDate.of(2023, 7, 15),2));
		taskList.add(new SortingTaskPriority(3, "tasklearn", LocalDate.of(2023, 7, 17),3));
		taskList.add(new SortingTaskPriority(3, "tasklearn1", LocalDate.of(2023, 7, 17),1));

		ArrayList<SortingTaskPriority> taskList2 = new ArrayList<>();

		taskList2.add(new SortingTaskPriority(5, "tasklearn", LocalDate.of(2023, 7, 11),1));
		taskList2.add(new SortingTaskPriority(2, "taskplay", LocalDate.of(2023, 7, 15),2));
		taskList2.add(new SortingTaskPriority(3, "tasklearn", LocalDate.of(2023, 7, 17),3));
		taskList2.add(new SortingTaskPriority(3, "tasklearn1", LocalDate.of(2023, 7, 17),1));
		taskList2.add(new SortingTaskPriority(1, "taseat", LocalDate.of(2023, 7, 19),2));
		

ArrayList<SortingTaskPriority> actualUniqueList1 = SortingTaskPriority.sortPriority(taskList);
		

		Assertions.assertIterableEquals(actualUniqueList1,taskList2);
		
		

	}
	
	
	
	@Test

	public void testInValidArray() {


		try {

			 SortingTaskPriority.sortPriority(null);
			Assertions.fail("testInValidarray failed");
		} catch (IllegalArgumentException ex) {

			Assertions.assertEquals("The array cannot be empty", ex.getMessage());

		}
		
		


	}

}