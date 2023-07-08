package day02.solved;

public class ShapeCalculatorMethod {


	// Calculating Area for Circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
		
		// Calculating Area for Rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }
    
    public static void main(String[] args) {
    	
    	ShapeCalculatorMethod calculator = new ShapeCalculatorMethod();
        double circleArea = calculator.calculateArea(3);                     
        double rectangleArea = calculator.calculateArea(2, 8);            
        
        System.out.println(circleArea);
        System.out.println(rectangleArea);
    }
}
