package com.leetcode.practice.dsalgo.negativeNumMatrixCount;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNegativeNumberBottomLeft {
	
	public static void main(String[] args) {
		List<List<Integer>> arr = List.of(List.of(4,4,-1),List.of(-1,-1,-1),List.of(-1,-1,-1),List.of(-1,8,7),List.of(6,5,4),List.of(3,2,1));
		int count = solve(arr);
		System.out.println(count);
	}
	
    static int solve(List<List<Integer>>  input){
        int m = input.size();
        int n = input.get(0).size();
        int cbl = 0;
        int rbl = m-1;
        
        int count = 0;
        while(rbl >= 0 && cbl <= n-1) {
            if(input.get(rbl).get(cbl) < 0) {
                count = count + (n-cbl);
                rbl--;
            } else {
                cbl++;
            }
        }
        return count;
	}

}
