package com.example.coding.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDate {

	static void changeDate(String date) {
		SimpleDateFormat inputFormat=new SimpleDateFormat("dd/mm/yyyy");
		SimpleDateFormat outputFormat=new SimpleDateFormat("yyyymmdd");
		try {
			Date parsedDate=inputFormat.parse(date);
			String outputDate=outputFormat.format(parsedDate);
			System.out.println(outputDate);
		} catch (ParseException e) {
			System.out.println("Cannot Converting");
		}
		
	}
	public static void main(String[] args) {
		changeDate("02/12/2019");
		changeDate("20/02/2020");
		changeDate("14/06/1997");
	}
}
