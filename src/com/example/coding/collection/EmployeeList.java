package com.example.coding.collection;

import java.util.LinkedList;
import java.util.List;

class Employee {
	int empNo;
	String name;

	public Employee(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "empNo = " + empNo + " name = " + name;
	}	
}

public class EmployeeList {

	List<Employee> empList = new LinkedList<>();

	public void addEmp(Employee e) {
		empList.add(e);
	}

	public void addEmpAtIndex(Employee e, int index) {
		empList.add(index, e);
	}

	public void display() {
		for(Employee emp:empList) {
			System.out.println(emp.toString());
		}
	}

	public static void main(String[] args) {
		EmployeeList list = new EmployeeList();
		list.addEmp(new Employee(1, "Jack"));
		list.addEmp(new Employee(2, "Bat"));
		list.addEmp(new Employee(3, "Super"));
		list.display();
		System.out.println("Adding Employee at index 1");
		list.addEmpAtIndex(new Employee(4, "Captain"), 1);
		list.display();
	}
}
