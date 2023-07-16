package day07.solved;

import java.util.TreeSet;

public class TestTreeSet {

   public static void main(String[] args) {

       // TreeSet sorts the collections
       TreeSet<String> cityNames = new TreeSet<String>();
       cityNames.add("Delhi");
       cityNames.add("Chennai");
       cityNames.add("Bangalore");
       cityNames.add("Andhra");

       for (String cityName : cityNames) {
           System.out.println(cityName);
       }
        
        
   }

}