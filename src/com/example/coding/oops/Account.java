package com.example.coding.oops;

public class Account {

	private int balance;
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int calculateInterest(String accType)
	{
		if(accType.equals("SA"))
			return balance*8/100;
		else if(accType.equals("CSA"))
			return balance*12/100;
		else
			return 0;
	}

	public static void main(String[] args) {
	Account account=new Account();
	account.setBalance(10000);
	int interest=account.calculateInterest("SA");
	System.out.print("Interest: "+interest);
	System.out.println("for "+account.getBalance());
	}
}
