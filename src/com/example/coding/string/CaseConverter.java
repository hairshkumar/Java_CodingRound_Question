package com.example.coding.string;

public class CaseConverter {

	public static void main(String[] args) {
		changeCase("AbCdEf");
		changeCase("aLLtHEbEST");
	}

	public static void changeCase(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(Character.isLowerCase(ch[i]))
				ch[i]=Character.toUpperCase(ch[i]);
			else if(Character.isUpperCase(ch[i]))
				ch[i]=Character.toLowerCase(ch[i]);
		}
		String changedCase=new String(ch);
		System.out.println(changedCase);
	}
}
