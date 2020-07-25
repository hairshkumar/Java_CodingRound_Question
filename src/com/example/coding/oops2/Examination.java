package com.example.coding.oops2;

class Student{
	int rollNo;
	String name;
	String address;
	 protected Student(int rollNo, String name, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
}
class Exam extends Student{
	int marks[];
	 protected Exam(int rollNo, String name, String address,int[] marks) {
		 super(rollNo,name,address);
		this.marks=marks;
	}	
}
class Result extends Exam{
	boolean ispass=true;
	int total;
	public Result(int rollNo, String name, String address,int[] marks) {
		super(rollNo,name,address,marks);
	}
	public String findresult() {
		for (int mark : marks) {
			total += mark;
			if (mark<35)
				ispass = false;
		}
		return ispass ? "pass" : "fail";
	}
}

public class Examination {
	public static void main(String[] args) {
		int marks[]= {40,44,55,65,59,72};
		Result result=new Result(111,"Jack","Cross Street",marks);
		System.out.println("Student Result : "+result.findresult());
	}
}
