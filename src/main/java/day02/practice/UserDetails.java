package day02.practice;

public class UserDetails {
	public static void main(String[] args) {
		user user = new user();
		
		user.setUserid(01);
		user.setUsername("saran");
		user.setUseremail("saran@gmail.com");
		user.setUserpassword("saran@21");
		
		System.out.println(user.getUserid());
		System.out.println(user.getUsername());
		System.out.println(user.getUseremail());
		System.out.println(user.getUserpassword());
	}

}
