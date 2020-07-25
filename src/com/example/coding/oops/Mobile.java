package com.example.coding.oops;

public class Mobile {

	int modelId;
	String company;
	int size;
	boolean isTouchScreen;

	public Mobile(int modelId, String company, int size, boolean isTouchScreen) {
		this.modelId = modelId;
		this.company = company;
		this.size = size;
		this.isTouchScreen = isTouchScreen;
	}

	public void mobileInfo() {
		System.out.println(modelId + " " + company + " " + size + " " + isTouchScreen);
	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile(1001, "Apple", 480, true);
		Mobile m2 = new Mobile(1002, "Redmi", 640, true);
		Mobile m3 = new Mobile(1003, "OPPO", 720, true);
		Mobile m4 = new Mobile(1004, "Samsung", 720, true);
		Mobile m5 = new Mobile(1005, "Realme", 720, true);
		Mobile[] mobiles = { m1, m2, m3, m4, m5 };
		System.out.println("ModelID Company Size TouchScreen");
		for(Mobile mobile:mobiles) {
			mobile.mobileInfo();
		}
	}
}
