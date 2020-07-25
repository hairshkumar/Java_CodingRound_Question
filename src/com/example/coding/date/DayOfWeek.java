package com.example.coding.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DayOfWeek {

	static void firstAndLast() {
		Calendar date = Calendar.getInstance();
		date.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		SimpleDateFormat dateformat = new SimpleDateFormat("EEE dd/MM/yyyy");
		System.out.println("Start Day"+dateformat.format(date.getTime()));
		//+6 will end of week
		date.add(Calendar.DATE, 6);
		System.out.println("End Day"+dateformat.format(date.getTime()));
	}

	public static void main(String[] args) {
		firstAndLast();
	}
}
