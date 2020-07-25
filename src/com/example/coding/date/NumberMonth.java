package com.example.coding.date;

import java.text.DateFormatSymbols;

public class NumberMonth {

	static void showMonth(int n) {
		String month=new DateFormatSymbols().getMonths()[n-1];
		System.out.println(month);
	}
	public static void main(String[] args) {
		showMonth(1);
		showMonth(2);
		showMonth(7);
		showMonth(9);
	}
}
