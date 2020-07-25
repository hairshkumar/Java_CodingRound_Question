package com.example.coding.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LockerCode {

	public static void main(String[] args) {
		checkLockerCode("12345");
		checkLockerCode("TN1234");
		checkLockerCode("1122222");
		checkLockerCode("ABCDSG");
		checkLockerCode("1234AU122");
	}

	static void checkLockerCode(String code) {
		String regex = "\\b[\\d]{5}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(code);
		System.out.println(code+" is valid "+m.matches());
	}
}
