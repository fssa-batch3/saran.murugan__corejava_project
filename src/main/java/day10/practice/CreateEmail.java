package day10.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


	//Creating a Exception by extending from RuntimeException
	class InvalidEmailException extends RuntimeException{

	
		private static final long serialVersionUID = 1L;
		
		public InvalidEmailException(String msg) {
			super(msg);
		}
		
		public InvalidEmailException(Throwable msg) {
			super(msg);
		}
		public InvalidEmailException(String msg,Throwable sg) {
			super(msg,sg);
		}
	}
	
	class EmailValidator {
		public static boolean isValidEmail(String emailId) throws InvalidEmailException {
			
			//Pattern for email
			String emailPattern = "^[\\w\\.-]+@[a-zA-Z\\d\\.-]+\\.[a-zA-Z]{2,}$";
			
			//If it's match with argument email it will return true else false
			Boolean isMatch = Pattern.matches(emailPattern, emailId);
			
			if(!isMatch){
				throw new InvalidEmailException("Invalid email");
			}
			
			return true;
			
		}
	}
	
	
	
	public class CreateEmail {
	
	public static void main(String[] args) {
		
		EmailValidator.isValidEmail("Saranfreaky@gmail.com");
		
	}

}