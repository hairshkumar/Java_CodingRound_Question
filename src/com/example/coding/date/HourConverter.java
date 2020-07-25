package com.example.coding.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HourConverter {

	static void to24Hours(String date) {
		SimpleDateFormat format1 = new SimpleDateFormat("hh:mm a");
		SimpleDateFormat format2 = new SimpleDateFormat("HH:mm");
		Date inputDate;
		String date2;
		try {

			if (date.contains("am") || date.contains("pm")) {
				inputDate = format1.parse(date);
				date2 = format2.format(inputDate);
			} else {
				inputDate = format2.parse(date);
				date2 = format2.format(inputDate);
			}
			System.out.println(date2);
		} catch (ParseException e) {
			System.out.println("Error in Formatting");
		}

	}

	public static void main(String[] args) {
		to24Hours("12:00 am");
		to24Hours("21:00");
	}

}
