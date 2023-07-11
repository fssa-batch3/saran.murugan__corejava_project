package day04.practice;

import day04.solved.Polygon;

public class Rectangle2 extends Polygon2 {
	
	protected double length;
	protected double breadth;
	
	public Rectangle2(double length, double breadth) throws Exception {
		super(4);
		if(length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {

		return this.length * this.breadth;
	}
	public double calculateCircumference() {

		return 2 * ( this.length + this.breadth) ;
	}
	
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}

}