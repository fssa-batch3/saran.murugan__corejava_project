package day06.solved;

	import java.util.ArrayList;
	import java.util.List;

	public class ArrayListCrud {
		public static void main(String[] args) {
			// Store the city names in the List
			List<String> cityList = new ArrayList<String>();
			cityList.add("Chennai");
			cityList.add("Bangalore");
			cityList.add("Mumbai");

			// Adding at particular Index
			cityList.add(2, "Delhi");

			// Added Delhi in Second Index
			System.out.println(cityList);

			// Reading with Index
			String elementAtOne = cityList.get(1);
			System.out.println(elementAtOne);

			// Changing the element at a particular index

			// Changing the element at 1 as Kolkata
			cityList.set(1, "Kolkata");

			// Reading the element at index 1 again
			elementAtOne = cityList.get(1);
			System.out.println(elementAtOne);

			// Deleting elements

			cityList.remove(1);

			System.out.println("Removing the element in the index 1");

			System.out.println(cityList);

			// Removing specific element
			cityList.remove("Delhi");

			System.out.println("List after removing Delhi");

			System.out.println(cityList);

		}

}
