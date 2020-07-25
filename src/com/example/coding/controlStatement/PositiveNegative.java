package com.example.coding.controlStatement;

public class PositiveNegative {

	public static void main(String[] args) {
		isPositive(10);
		isPositive(-10);
	}
static void isPositive(int n)
{
	if (n >=0){
        System.out.println(n+" is a positive integer");
     } else {
        System.out.println(n+" is a negative integer");
     }
}
}
