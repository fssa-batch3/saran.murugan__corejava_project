package day01.solved;
/**
 * In the real world, you'll often find many individual objects all of the same
 * kind. There may be thousands of other bicycles in existence, all of the same
 * make and model. Each car was built from the same set of blueprints and
 * therefore contains the same components. In object-oriented terms, we say that
 * your Car is an instance of the class of objects known as Cars. A
 * class is the blueprint from which individual objects are created.
 * 
 * @author BharathwajSoundarara
 *
 */
class Car {

	private int speed = 0;
	private int gear = 1;

	public void changeGear(int newValue) {
		gear = newValue;
	}

	public void speedUp(int increment) {
		speed = speed + increment;
	}

	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	public void printStates() {
		System.out.println(" speed:" + speed + " gear:" + gear);
		
		
	}
}

/**
 * Here's a CarDemo class that creates two separate Car objects and
 * invokes their methods:
 * 
 * @author saran
 *
 */
public class CarDemo {
	public static void main(String[] args) {

		// Create a Car object
		
		Car car1 = new Car();
		// Invoke methods on
		// those objects
		car1.speedUp(10);
		car1.changeGear(2);
		car1.printStates();

		Car car2 = new Car();

		car2.speedUp(10);
		car2.changeGear(2);
		car2.speedUp(10);
		car2.changeGear(3);
		car2.printStates();
	}
}
