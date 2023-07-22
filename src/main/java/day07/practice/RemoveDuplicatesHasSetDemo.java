package day07.practice;

import java.util.*;
/*
 * Question#1: Create an ArrayList<Integer> of numbers with duplicate entries.
 *  Use an HashSet<Integer> to remove the duplicates and display the Unique values
 */
public class RemoveDuplicatesHasSetDemo {
	public static void main(String[] args)  {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(1);
		arr.add(4);
		arr.add(5);
		arr.add(7);
		arr.add(7);
		removeDuplicateElements(arr);

	}

	public static void removeDuplicateElements(ArrayList<Integer> numbers) throws IllegalArgumentException {
		if (numbers == null) {
			throw new IllegalArgumentException("Array cannot be null");
		}
		// Set stores unique elements and ignores duplication
		HashSet<Integer> uniqueArr = new HashSet<Integer>(numbers);

		System.out.println("Using  Hasset to remove duplicates");
		for (Integer arr1 : uniqueArr) {
			System.out.print(arr1 + " ");

		}

	}

	public static boolean validateDuplicatemethod(ArrayList<Integer> numbers, HashSet<Integer> uniqueArr)
			throws Exception {
		HashSet<Integer> set = new HashSet<>(numbers);

		if (!set.equals(uniqueArr)) {
			throw new Exception("The array does not contain all unique elements.");

		}
		return true;

	}

}
