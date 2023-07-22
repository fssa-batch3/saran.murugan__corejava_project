package day09.practice;


import java.util.*;
import java.util.Scanner;

public class SortingUser {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a how may number should be");

		int n = scan.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println("Enter a the number should be");

		for (int i = 0; i < n; i++) {
			int input = scan.nextInt();
			arrayList.add(input);
		}

		List<Integer> list = sortNumber(arrayList);
		System.out.print("Sorted list: ");
		String data = "";
		for (int number : list) {
			data += number + " ";

		}

		System.out.print(data);
	}

	
	
	public static boolean ValidNumberSorting(int n) throws IllegalArgumentException {
		
		
	
		if(n<=1) {
		throw new	IllegalArgumentException("The number cannot be 1 and less than1");
			
		}
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		System.out.println("Enter a the number should be");

//		for (int i = 0; i < n; i++) {
//			int input = scan.nextInt();
//			arrayList1.add(input);
//		}

		List<Integer> list = sortNumber(arrayList1);
		System.out.print("Sorted list: ");
		String data = "";
		for (int number : list) {
			data += number + " ";

		}

//		System.out.print(data);
return true;

		
	}
	public static List<Integer> sortNumber(ArrayList<Integer> arrayList)throws IllegalArgumentException {
		if(arrayList==null) {
			throw new IllegalArgumentException("Array cannot be empty");
			
		}
		Collections.sort(arrayList);
		return arrayList;

	}
}