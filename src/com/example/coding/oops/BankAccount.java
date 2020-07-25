package com.example.coding.oops;

public class BankAccount {

	int id;
	String name;
	String branch;
	double amount;
	
	public BankAccount(int id, String name, String branch, double amount) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.amount = amount;
	}
	
	public BankAccount(int id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	public void show() {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Branch = "+branch);
		System.out.println("Amount = "+amount);
	}
	
	public static void main(String[] args) {
		BankAccount acc1=new BankAccount(1,"Jack","xxx11");
		BankAccount acc2=new BankAccount(2,"Bat","yyy11",1000);
		acc1.show();
		acc2.show();
	}
}
