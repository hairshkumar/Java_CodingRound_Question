package com.example.coding.loops;

public class SumOfDigits {

	public static void main(String[] args) {
		sumDigits(1234);
		sumDigits(1212);
		sumDigits(111111);
	}
	static void sumDigits(int n) 
    {     
	System.out.print("Sum of "+n);	
        int sum = 0;     
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
   System.out.println(" "+sum); 
    } 
}
