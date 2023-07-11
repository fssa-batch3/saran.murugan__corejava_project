package day04.solved;


class Account3 {

	private String accNo;

	private String name;

	private double balance;

	// Default Constructor
	public Account3() {

	}

	// Creating a Constructor which accepts all the attributes: Constructor
	// Overloading
	public Account3(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

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
	public String toString() {
	        return "Account [accNo=" + accNo + ", name=" + name + ", balance="  + balance + "]";
	    }


}