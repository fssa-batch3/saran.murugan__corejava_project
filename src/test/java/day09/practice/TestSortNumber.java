package day09.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSortNumber {

	@Test

	public void testValidarray() {

		ArrayList<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(99);
		arrayList1.add(29);
		arrayList1.add(19);
		arrayList1.add(9);

		ArrayList<Integer> expectedList = new ArrayList<>();
		expectedList.add(9);
		expectedList.add(19);
		expectedList.add(29);
		expectedList.add(99);

		ArrayList<Integer> actualUniqueList = (ArrayList<Integer>) SortingUser.sortNumber(arrayList1);

		Assertions.assertIterableEquals(expectedList, actualUniqueList);

	}
	
	
	
	@Test

	public void testInValid() {


		try {

			ArrayList<Integer> actualUniqueList = (ArrayList<Integer>) SortingUser.sortNumber(null);
			Assertions.fail("testInValidarray failed");
		} catch (IllegalArgumentException ex) {

			Assertions.assertEquals("Array cannot be empty", ex.getMessage());

		}
		
		
		try {
		SortingUser.ValidNumberSorting(0);

		Assertions.fail("testInValidarray failed");
		} catch (IllegalArgumentException ex) {

			Assertions.assertEquals("The number cannot be 1 and less than1", ex.getMessage());

		}

	}
}