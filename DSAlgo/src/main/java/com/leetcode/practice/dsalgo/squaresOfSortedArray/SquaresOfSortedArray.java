package com.leetcode.practice.dsalgo.squaresOfSortedArray;

import java.util.Arrays;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		//Input: nums = [-4,-1,0,3,10]
		//Output: [0,1,9,16,100]
		int[] arr = {-4,-1,0,3,10};
//		MergeSort mergeSort = new MergeSort();
//		int[] sortedArr = mergeSort.mergeSortApproach(arr); // -> TODO: Space: O(n) & Time: O(n)
//		DivideOnceMergeSort doms = new DivideOnceMergeSort();
//		int[] sortedArr = doms.divideOnceMergeSortApproach(arr); // -> TODO: Space: O(n) & Time: O(n)
		TwoPointerSquareSort tpss = new TwoPointerSquareSort();
		int[] sortedArr = tpss.twoPointerSquareSort(arr); // -> TODO: Space: O(n) & Time: O(n)
		System.out.println(Arrays.toString(sortedArr));
	}


}
