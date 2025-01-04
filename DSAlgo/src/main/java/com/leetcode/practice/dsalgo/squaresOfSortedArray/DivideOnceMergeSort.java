package com.leetcode.practice.dsalgo.squaresOfSortedArray;

public class DivideOnceMergeSort {
	public int[] divideOnceMergeSortApproach(int[] arr) {
		int mid;
		int ei = arr.length-1;
		int si = 0;
		for(mid=0; mid<=ei; mid++) {
			if(arr[mid]>=0)
				break;
		}
		mergeWithoutDivide(arr, si, mid-1, ei);
		return arr;
	}
	
	private static void mergeWithoutDivide(int[] arr, int si, int mid, int ei) {
		int[] newArr = new int[ei-si+1];
		int idx1 = mid;
		int idx2 = mid+1;
		int x = 0;
		while(idx1>=si && idx2<=ei) {
			if(arr[idx1] * arr[idx1] <= arr[idx2] * arr[idx2]) {
				newArr[x++] = arr[idx1] * arr[idx1];
				idx1--;
			} else {
				newArr[x++] = arr[idx2] * arr[idx2];
				idx2++;
			}
		}
		while(idx1>=si) {
			newArr[x++] = arr[idx1] * arr[idx1];
			idx1--;		
		}
		while(idx2<=ei) {
			newArr[x++] = arr[idx2] * arr[idx2];
			idx2++;
		}
		for(int i = 0; i<newArr.length; i++) {
			arr[si++] = newArr[i]; 
		}
	}
}
