package day07.practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHasSetDuplicatesRemove {
	
	@Test
	public void testValidArray() {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(1);
		arr.add(4);
		arr.add(5);
		arr.add(7);
		arr.add(7);
		
		HashSet<Integer> uniqueArray = new HashSet<Integer>(Arrays.asList(2, 4, 5, 7));
		try {
			RemoveDuplicatesHasSetDemo.removeDuplicateElements(arr);
			boolean valid=RemoveDuplicatesHasSetDemo.validateDuplicatemethod(arr, uniqueArray);
			Assertions.assertTrue(valid);
			Assertions.fail("Validate failed");
		}
		catch(Exception ex) 
		{
			Assertions.assertEquals("The array does not contain all unique elements.", ex.getMessage());
		}

	}
	
	
	
	
	@Test
	public void testInValidArray() {

		try {
			RemoveDuplicatesHasSetDemo.removeDuplicateElements(null);
			Assertions.fail("Validate failed");
		} catch (Exception ex) {
			Assertions.assertEquals("Array cannot be null", ex.getMessage());
		}

	

	}
	
}