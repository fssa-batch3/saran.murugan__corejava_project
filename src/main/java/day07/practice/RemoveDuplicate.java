package day07.practice;

import java.util.*;

/*
 * Question#1: Create an ArrayList<Integer> of numbers with duplicate entries.
 *  Use an HashSet<Integer> to remove the duplicates and display the Unique values
 */
public class RemoveDuplicate {
	public static void main(String[] args) throws Exception {


		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(1);
		arr.add(4);
		arr.add(5);
		arr.add(7);
		arr.add(7);
		removeDuplicate(arr);

	}

	public static void removeDuplicate(ArrayList<Integer> numbers) throws Exception {
		if (numbers == null) {
			throw new Exception("Array cannot be null");
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

