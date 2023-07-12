package day05.practice;

class Account {
	String accNo;
	double balance;

	public Account(String string, double d) {
		// TODO Auto-generated constructor stub
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}

   interface ATM {
	      boolean deposit1(Account account, double amount);

		 boolean withdraw(Account account, double amount) throws Exception;

	      double getBalance();
         }

   	
    class AxisATM implements ATM {
	    private static double WITHDRAWAL_CHARGES = 5.0;
	    
	    private Account account;

	    public AxisATM(Account account) {
	        this.account = account;
	    }

	    @Override
	    public boolean deposit1(Account account, double amount) {
	        account.setBalance(account.getBalance() + amount);
	        return true;
	    }

	    @Override
	    public boolean withdraw(Account account, double amount) throws Exception {
	        if (account.getBalance() < 5000) {
	            throw new Exception("Insufficient balance");
	        }

	        double withdrawalAmount = amount + WITHDRAWAL_CHARGES;
	        if (account.getBalance() >= withdrawalAmount) {
	            account.setBalance(account.getBalance() - withdrawalAmount);
	            return true;
	        } else {
	            throw new Exception("Insufficient balance after deducting withdrawal charges");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return account.getBalance();
	    }
	}


	 
   class IciciATM implements ATM {
		    private static final double Withdraw_Charges = 10.0;
		    private Account account;

		    public IciciATM(Account account) {
		        this.account = account;
		    }

		    @Override
		    public boolean deposit1(Account account, double amount) {
		        account.setBalance(account.getBalance() + amount);
		        return true;
		    }

		    @Override
		    public boolean withdraw(Account account, double amount) throws Exception {
		        if (account.getBalance() <1000) {
		            throw new Exception("Insufficient balance");
		        }

		        double withdrawalAmount = amount + Withdraw_Charges;
		        if (account.getBalance() >= withdrawalAmount) {
		            account.setBalance(account.getBalance() - withdrawalAmount);
		            return true;
		        } else {
		            throw new Exception("Insufficient balance after deducting withdrawal charges");
		        }
		    }

		    @Override
		    public double getBalance() {
		        return account.getBalance();
		    }
		}

public class AtmAccountDemo {

	public static void main(String[] args) {
		 
		 // Create an account
        Account account = new Account("12345", 10000.0);
        ATM axisATM = new AxisATM(account);

     
        axisATM.deposit1(account, 5000.0);

        // Withdraw money
        try {
            axisATM.withdraw(account, 2000.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Axis bank -"+"Account balance: " + axisATM.getBalance());
        

   
        ATM iciciATM = new IciciATM(account);
        iciciATM.deposit1(account, 5000.0);
        // Withdraw money
        try {
            iciciATM.withdraw(account, 3000.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Get balance
        System.out.println("Axis bank -"+"Account balance: " + iciciATM.getBalance());
	}			
}

