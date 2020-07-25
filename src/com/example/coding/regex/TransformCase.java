package com.example.coding.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TransformCase {

	public static void main(String[] args) {
		changeCase("ABCDXYZO");
		changeCase("AXBYCZDO");
	}

	static void changeCase(String str) {
		System.out.print(str+" is Transformed to ");
		String regex1 = "[a-mA-M]";
		String regex2 = "[n-zN-Z]";
		Pattern p = Pattern.compile(regex1);
		Matcher m = p.matcher(str);
		while (m.find()) {
			str = str.replaceAll(m.group(),"0");
		}
		p = Pattern.compile(regex2);
		m = p.matcher(str);
		while (m.find()) {
			str = str.replaceAll(m.group(),"1");
		}
		System.out.println(str);
	}
}
