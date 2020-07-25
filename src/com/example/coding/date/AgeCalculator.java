package com.example.coding.date;

import java.util.Calendar;

public class AgeCalculator {

	static void findAge(int bornYear) {
		Calendar c = Calendar.getInstance();
		int presentYear = c.get(Calendar.YEAR);
		int age=presentYear-bornYear;
		System.out.println("Your age is "+age);
	}

	public static void main(String[] args) {
		findAge(1997);
		findAge(2000);
		findAge(1995);
	}
}
