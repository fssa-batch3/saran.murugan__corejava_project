package day04.practice;

public class PolygonDemo {

public static void main(String[] args) {
		
		try {
			Rectangle2 rec = new Rectangle2(10.0,8.0);
			Polygon2 ratri = new RightAngledTriangle2(20, 10, 10);
			System.out.println(rec.calculateArea());
			System.out.println(rec.calculateCircumference());
			System.out.println(ratri.calculateArea());
			System.out.println(ratri.calculateCircumference());
			
		} catch (Exception e) {
 
			e.printStackTrace();
		}

	}
}
