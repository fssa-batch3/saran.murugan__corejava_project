package day02.solved;

class BankAccount{
	private String accNo;
	private String name;
    private double balance;
 
    public String getAccNo() {
        return accNo;
    }
 
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getBalance() {
        return balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class BankAccountEncap {

	 public static void main(String[] args) {
         
	        //create Account
	        BankAccount acct1 = new BankAccount();
	        acct1.setAccNo("50060021");
	        acct1.setName( "Saran" );
	        acct1.setBalance(10000);
	 
	        System.out.println(acct1.getAccNo());
	        System.out.println(acct1.getName());
	        System.out.println(acct1.getBalance());
	    }

}
