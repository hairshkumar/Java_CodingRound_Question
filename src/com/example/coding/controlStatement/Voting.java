package com.example.coding.controlStatement;

public class Voting {

	public static void main(String[] args) {
		iseligible(18);
		iseligible(50);
		iseligible(17);
	}
static void iseligible(int age)
{
	if(age>=18)
		System.out.println("Eligible to vote");
	else
		System.out.println("Not Eligible to vote");
}
}
