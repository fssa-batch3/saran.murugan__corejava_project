package day05.practice;


class Department {
	String deptName;
	int deptId;
	
	public Department(String deptName,int deptId) {
		this.deptName=deptName;
		this.deptId=deptId;
	}
	
}

class Student {
	String name;
	int id;
	Department department;

	public  Student(String name,int id,Department department) {
		
		this.name=name;
		this.id=id;
		this.department=department;

	}
	public void getStudent() {
		
		System.out.println("Student details");
		System.out.println("department name : " + department.deptName);
		System.out.println("Department id   : " + department.deptId);
		System.out.println("Student Name    : " + name);
		System.out.println("Student id      : " + id);
	}
	
	
}

public class StudentDet {
	public static void main(String[] args) {
		Department depart=new Department("FSSA", 92);
		Student std=new Student("Srikannan", 99, depart);
		std.getStudent();
	}

}