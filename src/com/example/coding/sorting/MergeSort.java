package com.example.coding.sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 6, 9, 8, 7, 4, 2 };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
	    System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
	}
	static void mergeSort(int[] array, int left, int right) {
	    if (right <= left) return;
	    int mid = (left+right)/2;
	    mergeSort(array, left, mid);
	    mergeSort(array, mid+1, right);
	    merge(array, left, mid, right);
	}
	static void merge(int[] arr, int left, int mid, int right) {
	    int leftLen = (mid - left)+ 1;
	    int rightLen = right - mid;

	    int leftArr[] = new int [leftLen];
	    int rightArr[] = new int [rightLen];

	    for (int i = 0; i < leftLen; i++)
	        leftArr[i] = arr[left+i];
	    for (int i = 0; i < rightLen; i++)
	        rightArr[i] = arr[mid+i+1];

	    int leftIndex = 0;
	    int rightIndex = 0;

	    for (int i = left; i < right + 1; i++) {
	        if (leftIndex < leftLen && rightIndex < rightLen) {
	            if (leftArr[leftIndex] <=rightArr[rightIndex]) {
	                arr[i] = leftArr[leftIndex];
	                leftIndex++;
	            }
	            else {
	                arr[i] = rightArr[rightIndex];
	                rightIndex++;
	            }
	        }
	        else if (leftIndex < leftLen) {
	            arr[i] = leftArr[leftIndex];
	            leftIndex++;
	        }
	        else if (rightIndex < rightLen) {
	            arr[i] = rightArr[rightIndex];
	            rightIndex++;
	        }
	    }
	}
}
