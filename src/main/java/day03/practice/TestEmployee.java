package day03.practice;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "naresh");
        Employee e2 = new Employee(2, "suresh");
        
        System.out.print("id="+e1.getId()+",");
        System.out.println("name="+e1.getName());
        
        System.out.print("id="+e2.getId()+",");
        System.out.println("name="+e2.getName());


    }
}

