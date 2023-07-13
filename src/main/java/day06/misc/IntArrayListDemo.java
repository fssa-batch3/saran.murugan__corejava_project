package day06.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArrayListDemo {
	public static void main(String[] args) {
		Integer[] arr = {3,4,5,6};
//		List<Integer> arrInt = new ArrayList<>(Arrays.asList(arr));
		List<Integer> arrInt = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(arrInt);
		arrInt.remove(Integer.valueOf(3));
		System.out.println(arrInt);
		
		
	}
}
