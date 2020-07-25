package com.example.coding.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayHour {

	static void showInAMPM() {
		Date today=new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("hh:mm a");
		System.out.println("Date is "+today);
		System.out.println(format1.format(today));
	}
	public static void main(String[] args) {
		showInAMPM();	
		}
}
