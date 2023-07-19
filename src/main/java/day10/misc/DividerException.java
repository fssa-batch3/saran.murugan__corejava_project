package day10.misc;

 class Divider{
	 public static int divisor(int a , int b)throws IllegalArgumentException{
		 
		 if(b ==0) {
			 throw new IllegalArgumentException("divisor can't be zero");	 
		 }
		 int c = a /b ; 
		 return c;
		 
	 }
 }


public class DividerException {
public static void main(String[] args) {
	
	Divider.divisor(4,0);
}
}
