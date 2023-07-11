package day04.practice;


public class RightAngledTriangle2 extends Polygon2{

	

	protected double height;
	protected double base;
	protected double hypo;
	
	public RightAngledTriangle2(double height, double base, double hypo) throws Exception {
		super(4);
		
		if(height <= 0 || base <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.height = height;
		this.base = base;
		this.hypo = hypo;
	}

	@Override
	public double calculateArea() {

		return this.height * this.base;
	}
	public double calculateCircumference() {

		return this.height + this.base +this.hypo;
	}
	
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}

}