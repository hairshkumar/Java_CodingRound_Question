package com.example.coding.logic1;

public class Number {

	static void isAutomorphic(int num) 
    { 
		boolean isAutomo=true;
		int temp=num;
        int square = num * num; 
        while (num > 0) { 
            if (num % 10 != square % 10) 
            	isAutomo=false;     
            num/= 10; 
            square /= 10; 
        } 
        if(isAutomo)
        	System.out.println(temp+" is Automorphic");
        else
    	System.out.println(temp+" is Not Automorphic");
    } 
  
    public static void main(String[] args) 
    { 
    	isAutomorphic(5);
    	isAutomorphic(76);
    	isAutomorphic(8);
    } 
}
