package day06.practice;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRemoveDuplicates {

	

//  for valid groundLocationLink
	@Test

	public void testValidarray() {
        
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");

		List<String> actualUniqueCityList = RemoveDuplicate.removeDuplicate(cityList);

		Assertions.assertEquals(3, actualUniqueCityList.size());
		Assertions.assertTrue(actualUniqueCityList.contains("Chennai"));
		Assertions.assertTrue(actualUniqueCityList.contains("Bangalore"));
		Assertions.assertTrue(actualUniqueCityList.contains("Mumbai"));
	}

	@Test

	public void testInValidarray() {

		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		try {

			List<String> actualUniqueCityList = RemoveDuplicate.removeDuplicate(cityList);
			Assertions.fail("testInValidarray failed");
		} catch (IllegalArgumentException ex) {

			Assertions.assertEquals("Array contains duplicate element", ex.getMessage());

		}
		List<String> cityList2 = new ArrayList<String>();
		try {

			List<String> actualUniqueCityList = RemoveDuplicate.removeDuplicate(cityList2);
			Assertions.fail("testInValidarray failed");
		} catch (IllegalArgumentException ex) {

			Assertions.assertEquals("Array cannot be empty", ex.getMessage());

		}

	}
}
