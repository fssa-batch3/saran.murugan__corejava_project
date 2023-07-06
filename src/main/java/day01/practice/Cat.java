package day01.practice;

public class Cat{
 
	private int age;
    private String color;

    // Constructor
    public void cat(int age) {
        this.age = age;
        
    }

    // Getters and setters
    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String speak() {
        return ("meow!");
    }

    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
        Cat cat1 = new Cat();
        cat1.setColor("White");
        cat1.setAge(4);
        Cat cat2 = new Cat();
        cat2.setColor("Black");
        cat2.setAge(3);

        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Age : " + cat1.age());
        System.out.println("Color: " + cat1.getColor());
	    System.out.println("Speaks: " + cat1.speak());

        System.out.println("Cat 2:");
        System.out.println("Age: " + cat2.age());
        System.out.println("Color: " + cat2.getColor());
        System.out.println("Speaks: " + cat1.speak());
    }
  }
  

