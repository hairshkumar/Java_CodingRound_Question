package com.example.coding.loops;

public class TableGenerator {

	public static void main(String[] args) {
		generate(10,5);
	}

	static void generate(int num, int limit) {
		for (int i = 1; i <= limit; i++)
			System.out.println(num + "*" + i + "=" + (num * i));
	}
}
