package com.example.coding.pattern;


public class NumberPattern {
	 
    public static void main(String[] args) {
    	numberPattern(5);
    }
    static void numberPattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}