package day08.practice;


import java.util.*;

public class HashMapEmployees {
public static void main(String[] args) {
	
Scanner scan=new Scanner(System.in);
Map<String, List<String>> departmentEmployees = new  TreeMap<>();


for(int i=0;i<5;i++) {
	System.out.println("Enter input like :Hr,Name");
	String str=scan.nextLine();
	if(str==null || "".equals(str)) {
		
		throw new IllegalArgumentException("Input cant't be Empty or Null");
	}
	
	String [] arrstr=str.split(",");
	
	if(arrstr.length<2 || arrstr.length>2 ) {
		throw new IllegalArgumentException("Input Must have department and employee name");
	}
	
	if(departmentEmployees.get(arrstr[0])==null) {
		departmentEmployees.put(arrstr[0], new ArrayList<>());
		departmentEmployees.get(arrstr[0]).add(arrstr[1]);
	}
	else {
		departmentEmployees.get(arrstr[0]).add(arrstr[1]);
	}
	
}
for(Map.Entry<String, List<String>> ex : departmentEmployees.entrySet()) {
	String departName=ex.getKey();
	List<String> empNames = ex.getValue();
//	Collections.sort(empNames);
	System.out.println(departName+": "+empNames);
	
}

}
	


public static boolean departmentNameEmployees(ArrayList<String> depOfEmployees) throws IllegalArgumentException {
	if(depOfEmployees==null) {
		
		throw new IllegalArgumentException("Array cant't be Empty or Null");
	}
	
	
	
	Map<String, List<String>> departmentEmployees = new TreeMap<>();
	
	System.out.println("Enter input like :Hr,Name");
	
	
	for(int i=0;i<depOfEmployees.size();i++) {
		System.out.println("Enter input like :Hr,Name");
		String str=depOfEmployees.get(i);
		if(str==null || "".equals(str)) {
			
			throw new IllegalArgumentException("Input cant't be Empty or Null");
		}
		
		String [] arrstr=str.split(",");
		
		if(arrstr.length<2 || arrstr.length>2 ) {
			throw new IllegalArgumentException("Input Must have department and employee name");
		}
		
		if(departmentEmployees.get(arrstr[0])==null) {
			departmentEmployees.put(arrstr[0], new ArrayList<>());
			departmentEmployees.get(arrstr[0]).add(arrstr[1]);
		}
		else {
			departmentEmployees.get(arrstr[0]).add(arrstr[1]);
		}
		
	}
	
	for(Map.Entry<String, List<String>> ex : departmentEmployees.entrySet()) {
		String departName=ex.getKey();
		List<String> empNames = ex.getValue();
		Collections.sort(empNames);
		System.out.println(departName+": "+empNames);
		
	}
	
	
	return true;
	
	
	
}
}



