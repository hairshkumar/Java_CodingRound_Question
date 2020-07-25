package com.example.coding.controlStatement;

public class TaxiFare {

	public static void main(String[] args) {
		taxiFare(5);
		taxiFare(18);
		taxiFare(30);
	}

	static void taxiFare(int d) {
		int fare = 0;
		if (d <= 5)
			fare = 10;
		else if (d > 5 && d<25)
			fare = (5 * 10) + ((d - 5) * 8);
		else if (d >= 25)
			fare = (20 * 8) + ((d - 20) * 5);
		System.out.println(fare);
	}
}
