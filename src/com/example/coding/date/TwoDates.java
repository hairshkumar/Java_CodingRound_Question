package com.example.coding.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TwoDates {
	static void to24Hours(String date1, String date2) {
		SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
		try {
			Date inputDate1 = format1.parse(date1);
			Date inputDate2 = format1.parse(date2);
			long diffInMillies = Math.abs(inputDate1.getTime() - inputDate2.getTime());
			long diffHours = diffInMillies / (60 * 60 * 1000);
			long diffSeconds = diffInMillies / 1000 % 60;
			long diffMinutes = diffInMillies / (60 * 1000) % 60; 
			System.out.println("hours: " + diffHours);
			System.out.println("seconds: " + diffSeconds);
			System.out.println("minutes: " + diffMinutes);
		} catch (ParseException e) {
			System.out.println("Error while parsing");
		}
	}

	public static void main(String[] args) {
		to24Hours("07/14/2016 11:00 AM", "07/15/2016 11:00 AM");
		to24Hours("07/15/2016 9:00 AM", "07/15/2016 11:00 AM");
	}
}
