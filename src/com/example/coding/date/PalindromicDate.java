package com.example.coding.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PalindromicDate {

	static void ispalindromicDate(String date) {
		SimpleDateFormat format1 = new SimpleDateFormat("dd/mm/yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat("mm/dd/yyyy");
		Date inputDate;
		try {
			inputDate = format1.parse(date);
			String date2 = format2.format(inputDate);
			if (date.equals(date2))
				System.out.println(date + " is palindromic");
			else
				System.out.println(date + " is not palindromic");
		} catch (ParseException e) {
			System.out.println("Error in Formatting");
		}

	}

	public static void main(String[] args) {
		ispalindromicDate("02/02/2020");
		ispalindromicDate("14/06/2020");
	}

}
