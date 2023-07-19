package day10.practice;


import java.util.ArrayList;


//Creating a Exception by extending from RuntimeException
 class UserAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public UserAlreadyExistsException(String msg) {
		super(msg);
	}
	
	public UserAlreadyExistsException(Throwable msg) {
		super(msg);
	}
	public UserAlreadyExistsException(String msg,Throwable sg) {
		super(msg,sg);
	}
}

class User {
	int id;
	String name;
	String emailId;
	
	public User(int id,String name,String emailId) {
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}
	
}

	class Account{
	
	static ArrayList<User> arr = new ArrayList<User>();
	
	static public String register(User user) throws UserAlreadyExistsException{
		
		if(arr.size() == 0){
			arr.add(user);
			return "User added";
		}
		
		for(User ele : arr){
			if(ele.emailId.equals(user.emailId)){
				throw new UserAlreadyExistsException("Email already exsist");
			}
		}
		
		arr.add(user);
		return "User added";
	}
}

public class AddUser {
	public static void main(String[] args) {
		
		User user1 = new User(1,"saran","saran@gmail.com");
		User user2 = new User(2,"bloodysweet","leo@gmail.com");
		
		Account.register(user1);
		Account.register(user2);
		
	}
}