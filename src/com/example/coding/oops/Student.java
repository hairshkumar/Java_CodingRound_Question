package com.example.coding.oops;

public class Student {

	int id;
	int marks[];
	String result = "pass";

	public Student(int id, int[] marks) {
		super();
		this.id = id;
		this.marks = marks;
	}

	public int findresult() {
		int total = 0;
		for (int mark : marks) {
			total += mark;
			if (mark<35)
				result = "fail";
		}
		return total;
	}

	public void isPass() {
		int total=findresult();
		System.out.println("Total "+total);
		System.out.println("Result "+result);
	}
	public static void main(String[] args) {
		int[] marks=new int[] {45,65,35,60,29};
		Student s=new Student(1,marks);
		s.isPass();
	}
}
