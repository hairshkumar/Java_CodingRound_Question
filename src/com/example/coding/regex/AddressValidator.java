package com.example.coding.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressValidator {

	public static void main(String[] args) {
		check("000.12.12.034");
		check("000.12.234.23.23");
		check("121.234.12.12");
		check("hi.Am.ip.addr");
	}
	static void check(String addr) {
		String ipNumbers = "([012][0-5][0-5]|[0-9][0-9]|[0-9])";
		String ipPattern=ipNumbers+"\\."+ipNumbers+"\\."+ipNumbers+"\\."+ipNumbers;
		Pattern p = Pattern.compile(ipPattern); 
		Matcher m = p.matcher(addr); 
		System.out.println("is valid "+addr+" "+m.matches());
	}
}
