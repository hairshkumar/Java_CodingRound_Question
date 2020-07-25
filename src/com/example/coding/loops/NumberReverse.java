package com.example.coding.loops;

public class NumberReverse {

	public static void main(String[] args) {
		reverse(1234);
		reverse(2255);
		reverse(121212);
	}
 static void reverse(int num)
{
	int revNum=0;
	while(num != 0) {
        int digit = num % 10;
        revNum = revNum * 10 + digit;
        num /= 10;
    }
	System.out.println(revNum);
}
}
