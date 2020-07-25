package com.example.coding.sorting;

import java.util.Arrays;

public class CountingSort {

	static void sort(char arr[]) 
    { 
        int size = arr.length; 
        char[] output = new char[size]; 
        int[] count= new int[256]; 

        for (int i=0; i<256; ++i) 
            count[i] = 0; 
        
        //Counting of Each element occurrence
        for (int i=0; i<size; ++i) 
            ++count[arr[i]]; 
        
        //Sum of current and previous element
        for (int i=1; i<=255; ++i) 
            count[i] += count[i-1]; 
        
        for (int i = size-1; i>=0; i--) 
        { 
            output[count[arr[i]]-1] = arr[i]; 
            --count[arr[i]]; 
        } 
        arr=Arrays.copyOf(output, output.length);
        System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
    } 
    public static void main(String args[]) 
    { 
        String str="CountingSort";
        char[] arr=str.toCharArray();
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
        sort(arr); 
    } 
}
