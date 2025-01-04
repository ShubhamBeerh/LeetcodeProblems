package com.leetcode.practice.dsalgo.squaresOfSortedArray;

public class MergeSort {

	public int[] mergeSortApproach(int[] nums) {
		int n = nums.length;
		int si = 0;
		int ei = n-1;
		for(int i=0; i<n; i++) {
			nums[i] = nums[i] * nums[i];
		}
		dacMergeSortApproach(nums, si, ei);
		return nums;
	}
	
	private void dacMergeSortApproach(int[] arr, int si, int ei) {
		if(si>=ei)
			return;
		int mid = si + (ei-si)/2;
		dacMergeSortApproach(arr, si, mid);
		dacMergeSortApproach(arr, mid+1, ei);
		mergeWithDivide(arr, si, mid, ei);
	}
	
	private void mergeWithDivide(int[] arr, int si, int mid, int ei) {
		int[] newArr = new int[ei-si+1];
		int idx1 = si;
		int idx2 = mid+1;
		int x = 0;
		while(idx1<=mid && idx2<=ei) {
			if(arr[idx1] <= arr[idx2]) {
				newArr[x++] = arr[idx1];
				idx1++;
			} else {
				newArr[x++] = arr[idx2];
				idx2++;
			}
		}
		while(idx1<=mid) {
			newArr[x++] = arr[idx1++];
		}
		while(idx2<=ei) {
			newArr[x++] = arr[idx2++];
		}
		for(int i = 0; i<newArr.length; i++) {
			arr[si++] = newArr[i]; 
		}
	}

}
