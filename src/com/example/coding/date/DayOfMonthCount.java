package com.example.coding.date;

import java.util.Calendar;

public class DayOfMonthCount {

	public static void main(String[] args) {
		display(2020, 6);
		display(2020, 3);
	}

	static void display(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		int DAY_OF_MONTH = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(DAY_OF_MONTH);
	}
}
