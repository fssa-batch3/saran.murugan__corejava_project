package day08.misc;

import java.util.HashMap;
import java.util.Map;

public class productHashmap {

	public static void main(String[] args) {
		
	Map<String,Integer>countMap = new HashMap<String,Integer>();
	
	String[] arrNames = {"OnePlus","Redmi","Apple13","OnePlus","Redmi"};
	
	for(int i=0; i<arrNames.length;i++) {
		
		if(countMap.get(arrNames[i]) == null){
			countMap.put(arrNames[i],1);
			
		}
		else {
			int count = countMap.get(arrNames[i]);
			count++;
			countMap.put(arrNames[i], count);
		    System.out.println(arrNames[i]+count);
		}
		
	}
}

}
