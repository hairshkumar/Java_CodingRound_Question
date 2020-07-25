package com.example.coding.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ATMPin {

	public static void main(String[] args) {
		checkLockerCode("1234");
		checkLockerCode("ABCD");
		checkLockerCode("123123");
		checkLockerCode("ABCDSG");
		checkLockerCode("1234AU");
	}

	static void checkLockerCode(String pin) {
		String regex = "^(?=(?:.{4}|.{6})$)[0-9]*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(pin);
		System.out.println("ATMPIN "+pin+" is valid "+m.matches());
	}	
}
