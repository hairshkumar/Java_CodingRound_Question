package com.example.coding.controlStatement;

public class LeapYear {

	public static void main(String[] args) {
	isLeap(2000);
	isLeap(2012);
	isLeap(1900);
	}
	static void isLeap(int year)
	{
		boolean leap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else {
			leap = false;
		}
		if (leap)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}
}