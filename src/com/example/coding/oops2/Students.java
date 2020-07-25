package com.example.coding.oops2;

class StudentCom {
	int regNo;
	String name;
	int sub1;
	int sub2;
	int sub3;

	protected StudentCom(int regNo, String name, int sub1, int sub2, int sub3) {
		this.regNo = regNo;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
}

class BEStudent extends StudentCom {
	String deptName;
	String coreSub;

	public BEStudent(int regNo, String name, int sub1, int sub2, int sub3, String deptName, String coreSub) {
		super(regNo, name, sub1, sub2, sub3);
		this.coreSub = coreSub;
		this.deptName = deptName;
	}
	
	public void internalMark() {
		int internal=(sub1*50/100)+(sub2*25/100)+(sub3*25/100);
		System.out.println("Internal Marks of id:"+regNo+" is "+internal);
	}
}

class MCAStudent extends StudentCom {
	String deptName;
	String coreSub;

	public MCAStudent(int regNo, String name, int sub1, int sub2, int sub3, String deptName, String coreSub) {
		super(regNo, name, sub1, sub2, sub3);
		this.coreSub = coreSub;
		this.deptName = deptName;
	}
	public void internalMark() {
		int internal=(sub1*40/100)+(sub2*30/100)+(sub3*30/100);
		System.out.println("Internal Marks of id:"+regNo+" is "+internal);
	}
}

public class Students {
	public static void main(String[] args) {
		BEStudent beStudent=new BEStudent(11,"Jack",50,60,55,"CSE","JAVA");
		MCAStudent mcaStudent=new MCAStudent(15,"Bat",70,50,55,"Business","Coding");
		beStudent.internalMark();
		mcaStudent.internalMark();
	}
}
