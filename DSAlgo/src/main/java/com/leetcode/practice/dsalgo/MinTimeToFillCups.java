package com.leetcode.practice.dsalgo;

public class MinTimeToFillCups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,4};
		System.out.println(numberOfCups(arr));
	}
	
	static int numberOfCups(int[] arr) {
		int max = arr[0];
		int maxIndex = 0;
		int sumAll = 0;
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			sumAll = sumAll + arr[i];
			if(arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		int remainingSum = sumAll - max;

		int remainingCups = max > remainingSum ? max - remainingSum : remainingSum - max;
		int pairs = remainingCups/2;
		return max > remainingSum ? remainingSum + pairs + (remainingCups - 2 * pairs) : max + pairs + (remainingCups - 2 * pairs);
	}

}
