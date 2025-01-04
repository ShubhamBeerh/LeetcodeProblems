package com.leetcode.practice.dsalgo.squaresOfSortedArray;

public class TwoPointerSquareSort {
	
	public int[] twoPointerSquareSort(int[] arr) {
		int n = arr.length;
		int start = 0;
		int end = n-1;
		int[] newArr = new int[n];
		for(int i = n-1; i>=0; i--) {
			if(absoluteVal(arr[start]) >= absoluteVal(arr[end])) {
				newArr[i] = arr[start] * arr[start];
				start++;
			} else {
				newArr[i] = arr[end] * arr[end];
				end--;
			}
		}
		for(int i=0; i<n; i++) {
			arr[i] = newArr[i];
		}
		return arr;
	}
	
	private int absoluteVal(int n) {
		if(n<0)
			return -1*n;
		return n;
	}

}
