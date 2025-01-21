package com.leetcode.practice.dsalgo;

public class NumberEvenOddBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(17));
	}
	
    static int[] solve(int n){
        //17 = 10001 -> 2 | 2 = 10 -> 1
        // Shift 1 -> 0th Elememtn 2-> 1st element 
        int[] arr = new int[2];
        int sumOdd = 0;
        int sumEven = 0;
        int shiftCount = 0;
        for(int temp = n; temp!=0; temp >>= 1, shiftCount++) {
            if((n & 1) != 0 && (shiftCount & 1) == 0)
                 arr[1] = arr[1] + 1;
            else if((n & 1) != 0 && (shiftCount & 1) != 0)
                 arr[0] = arr[0] + 1;
        }
        return arr;
    }

}
