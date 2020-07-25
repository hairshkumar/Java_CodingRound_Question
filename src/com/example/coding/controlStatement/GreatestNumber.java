package com.example.coding.controlStatement;

public class GreatestNumber {
public static void main(String[] args) {
	greatesNum(10, 20, 30);
	greatesNum(15, 10, 5);
	greatesNum(15, 20, 10);
}
static void greatesNum(int n1,int n2,int n3) {
    if( n1 >= n2 && n1 >= n3)
        System.out.println(n1+" is the largest Number");
    else if (n2 >= n1 && n2 >= n3)
        System.out.println(n2+" is the largest Number");
    else
        System.out.println(n3+" is the largest Number");
}
}
