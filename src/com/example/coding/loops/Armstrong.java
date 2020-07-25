package com.example.coding.loops;

public class Armstrong {

	public static void main(String[] args) {
		isArmstrong(153);
		isArmstrong(371);
		isArmstrong(1120);
	}

	public static void isArmstrong(int num) {
		int temp = num;
		int length = String.valueOf(temp).length();
		double r, c = 0;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			c = c + Math.pow(r, length);
		}
		if (temp == c)
			System.out.println("Armstrong "+c);
		else
			System.out.println("Not Armstrong "+c);
	}
}
