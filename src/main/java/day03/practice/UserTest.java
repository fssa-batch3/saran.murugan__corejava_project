package day03.practice;



class User{
	 private String name;
	 private String email;
	 private String password;
	 
	// Default Constructor
	 User(){
		 
	 }
	 
	    // Creating a Constructor which accepts all the attributes: Constructor
		// Overloading
	 public User(String email, String name, String password) {
			this.email = email;
			this.name = name;
			this.password = password;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}



 public class UserTest {
   public static void main(String[] args) {
	
	// create Account using Setter methods and Default constructor
	   User acct = new User();
		acct.setName("SaranFreaky");
		acct.setEmail("Saran@gmail.com");
		acct.setPassword("Saran12345678");
		
		
		System.out.println("Account 1 : "+acct.getName() + " - " + acct.getEmail() + " - "+ acct.getPassword());
		
		// Create Account with Overloaded constructor accepting parameters
		User acct2 = new User("barath@gmail.com", "Barath","barath12345");
		System.out.println("Account 2 :"+acct2.getName() + " - " + acct2.getEmail() + " - "+ acct2.getPassword());
   }
}


