package com.example.coding.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
	public static void main(String[] args) {
		isPasswordValid("Jack@2014");
		isPasswordValid("Superman$1");
	}

	static void isPasswordValid(String password) {
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		System.out.println(password+" is valid "+m.matches());
	}
}
