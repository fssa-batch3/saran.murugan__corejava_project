package day09.misc;

import java.util.ArrayList;
import java.util.Collections;

public class SortCompareToIgnoreCase {
	public static void main(String[] args) {
		ArrayList<String> cityNames = new ArrayList<String>();
		cityNames.add("Delhi");
		cityNames.add("Chennai");
		cityNames.add("bangalore");

		System.out.println("Before Sort:" + cityNames);
//		Collections.sort(cityNames);
		Collections.sort(cityNames,String::compareToIgnoreCase);
		System.out.println("After Sort:" + cityNames);
	}
}
