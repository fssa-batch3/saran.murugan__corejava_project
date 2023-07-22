package day08.practice;


import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDepartment {
	public ArrayList<String> input() {
		ArrayList<String> depList = new ArrayList<>();
		depList.add("HR,Ram");
		depList.add("HR,Suresh");
		depList.add("It,Baskar");
		depList.add("It,Joseph");
		depList.add("Admin,Sundar");

		return depList;

	}

	@Test
	public void testValidDepartment() {

		Assertions.assertTrue(HashMapEmployees.departmentNameEmployees(input()));

	}

	@Test
	public void testInValidDepartment() {

		try {
			HashMapEmployees.departmentNameEmployees(null);
			Assertions.fail("Departmentnamescount failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Array cant't be Empty or Null", ex.getMessage());
		}

		try {

			ArrayList<String> n = input();
			n.add(null);
			HashMapEmployees.departmentNameEmployees(n);
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Input cant't be Empty or Null", ex.getMessage());
		}

		try {

			ArrayList<String> n = input();
			n.add("Admin,Ram,Sundar");
			HashMapEmployees.departmentNameEmployees(n);
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Input Must have department and employee name", ex.getMessage());
		}

	}

}