package com.example.coding.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlate {

	public static void main(String[] args) {
		checkLicensePlate("1234TN");
		checkLicensePlate("TN1234");
		checkLicensePlate("1122222");
		checkLicensePlate("ABCDSG");
		checkLicensePlate("1234AU");
	}

	static void checkLicensePlate(String plateNo) {
		String regex = "(\\d{4}\\w\\w)";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(plateNo);
		System.out.println(plateNo+" is valid "+m.matches());
	}
}
