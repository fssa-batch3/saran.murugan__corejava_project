package day03.solved;


public class TestAccount {
	 
    public static void main(String[] args) {
         
        //create Account
        Account1 acct1 = new Account1("A101", "Naresh" , 1000 );
        System.out.println(acct1.accNo + "-" + acct1.name + "-" + acct1.balance);
         
         
        //create Account
        Account1 acct2 = new Account1("A102","Arun", 1000);
        System.out.println(acct2.accNo + "-" + acct2.name + "-" + acct2.balance);
    }
 
}