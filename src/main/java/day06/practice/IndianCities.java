package day06.practice;

import java.util.ArrayList;

import java.util.List;
public class IndianCities {
	public static void main(String[] args) {
		
      List<String> city= UniqueList.initialList();
      System.out.println(UniqueList.finalList(city)) ;
	}
}
class UniqueList {
	
	public static List<String> initialList() {
		List<String> addingList = new ArrayList<>();
	
		addingList.add("Chennai");
		addingList.add("Bangalore");
		addingList.add("Mumbai");
		addingList.add("Mumbai");
		addingList.add("Delhi");
		addingList.add("Delhi");
		addingList.add("Delhi");
		
		return addingList;
	}
	
	public static List<String> finalList(List<String> addingList) {
		
		List<String> newList = new ArrayList<>();
		
		for (int i = 0; i < addingList.size(); i++) {
			boolean repetative = false;
			for (int j = i + 1; j < addingList.size(); j++) {
				if (addingList.get(i).equals(addingList.get(j))) {
					repetative = true;
					break;
				}
			}
			if (!repetative) {
				newList.add(addingList.get(i));
			}
		}
		return newList;
	}
}