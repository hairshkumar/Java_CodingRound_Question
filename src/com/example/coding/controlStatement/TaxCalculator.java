package com.example.coding.controlStatement;

public class TaxCalculator {

	public static void main(String[] args) {
		taxAmount(250000);
		taxAmount(350000);
		taxAmount(750000);
		taxAmount(1000000);
	}
	static void taxAmount(int income) {
		int tax = 0;
		if (income < 250000)
			tax = 0;
		else if (income > 250000 && income < 500000)
			tax = ((income - 250000) * 5) / 100;
		else if (income > 500000 && income < 1000000)
			tax = ((income - 500000) * 20) / 100 + 25000;
		else if (income >= 1000000)
			tax = 112500 + ((income - 1000000) * 30) / 100;
		System.out.println("Tax Amount "+tax);
	}
}
