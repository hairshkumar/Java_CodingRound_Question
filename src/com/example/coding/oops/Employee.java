package com.example.coding.oops;

public class Employee {

	int id;
	String name;
	Address address;
	float salary;
	public Employee(int id, String name, Address address, float salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
public void display() {
	System.out.println("Id: "+id);
	System.out.println("name: "+name);
	System.out.println("Salary: "+salary);
	address.showAddress();
}
	public static void main(String[] args) {
		Address a1=new Address(6000,"xxxx");
		Employee e=new Employee(1,"Jack",a1,1200f);
		Address a2=new Address(7000,"yyyy");
		Employee e2=new Employee(2,"bat",a2,1100f);
		e.display();
		e2.display();
	}
}
class Address{
	int pincode;
	String sname;
	
	Address(int code,String street)
	{
		pincode=code;
		sname=street;
	}

	public void showAddress() {
		System.out.println("PinCode: "+pincode);
		System.out.println("Street: "+sname);
	}
}
