package com.example.coding.loops;

import java.util.Scanner;

public class UserSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers");
		int sum = 0;
		String quit = "";
		do {
			int num = scan.nextInt();
			sum += num;
			System.out.println("Enter q to Exit");
			quit = scan.next();
		} while (!quit.equals("q"));
		System.out.println(sum);
		scan.close();
	}
}
