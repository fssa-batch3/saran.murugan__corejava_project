package day06.solved;

import java.util.ArrayList;

public class TestArrayListWithGenerics {

	public static void main(String[] args) {
        
        // Store the city names in the List ( use Generics )
        ArrayList<String> cityList  = new ArrayList<String>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
         
        // Display the city names
        for (String cityName : cityList) {           
            System.out.println(cityName);           
        }
 
    }
 
}
