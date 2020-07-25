package com.example.coding.controlStatement;

public class Ranking {

	public static void main(String[] args) {
		findRank(80);
		findRank(65);
		findRank(55);
		findRank(35);
		findRank(14);
	}
	static void findRank(int n)
	{
		char rank;
		if(n>=80)
			rank='A';
		else if(n>60&&n<80)
			rank='B';
		else if(n>50&&n<=60)
			rank='C';
		else if(n>45&&n<=50)
			rank='D';
		else if(n>25&&n<=45)
			rank='E';
		else
			rank='F';
		System.out.println("Rank "+rank);
	}
}
