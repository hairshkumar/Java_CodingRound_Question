package com.example.coding.logic1;

public class LCMAndGCD {

	public static void main(String[] args) {
		int num1=60,num2=24;
		int gcd=findGCD(num1,num2);
		int lcm=findLCM(num1, num2, gcd);
		System.out.println("Number1="+num1+" Number2="+num2);
		System.out.println("GCD = "+gcd+"\nLCM = "+lcm);
	}

	public static int findLCM(int num1,int num2,int gcd) {
		return (num1*num2)/gcd;
	}
	
	public static int findGCD(int num1,int num2) {
		int remainder = 0;
		do {
			remainder = num1 % num2;
			num1 = num2;
			num2 = remainder;
		} while (num2 != 0);
		return num1;
	}
}