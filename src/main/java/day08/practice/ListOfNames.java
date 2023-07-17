package day08.practice;
import java.util.HashMap;
import java.util.Map;

public class ListOfNames{
    public static void main(String[] args) {
        Map<String, Integer> countMap = new HashMap<>();

        String[] arrNames = {"Ram", "Ram", "Superman", "Spider", "hey", "hello", "Spider"};

        for (int i = 0; i < arrNames.length; i++) {
            if (countMap.get(arrNames[i]) == null) {
                countMap.put(arrNames[i], 1);
            } else {
                int count = countMap.get(arrNames[i]);
                count++;
                countMap.put(arrNames[i], count);
            }
        }

        // Print the count for each name
        for (String name : countMap.keySet()) {
            int count = countMap.get(name);
            System.out.println(name + ": " + count);
        }
    }
}
