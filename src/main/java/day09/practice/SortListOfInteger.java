package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortListOfInteger {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

    System.out.print("Enter numbers: like 10,20,33 put comma ");
    String input = scanner.nextLine();

    // Split the input string into separate numbers
    String[] numbers = input.split(",");

    // Create a ArrayList to store the integers
    ArrayList<Integer> integerList = new ArrayList<>();

       //add each number to the ArrayList
    for (String number : numbers) {
        try {
            integerList.add(Integer.parseInt(number));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number: " + number);
        }
    }

    // Sort the ArrayList
    Collections.sort(integerList);

    // Print the sorted list
    System.out.print("Sorted list: ");
    for (Integer number : integerList) {
        System.out.print(number + " ");
    }

}
}
