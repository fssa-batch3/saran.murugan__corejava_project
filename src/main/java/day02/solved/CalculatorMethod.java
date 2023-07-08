package day02.solved;

public class CalculatorMethod {
	
	public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public String add(String a, String b) {
        return a + b;
    }
    
    public static void main(String[] args) {
    	
    	CalculatorMethod calc = new CalculatorMethod();
    	System.out.println(calc.add(2, 3));           // Output: 5
    	System.out.println(calc.add(2.5, 3.7));       // Output: 6.2
    	System.out.println(calc.add("Hello", "World"));  // Output: HelloWorld
	}

}
