package com.leetcode.practice.dsalgo.negativeNumMatrixCount;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CountNegativeNumMatrix {

	public static void main(String[] args) {
		List<Integer> col1 = new ArrayList<>();
		List<Integer> col2 = new ArrayList<>();
		List<Integer> col3 = new ArrayList<>();
		List<Integer> col4 = new ArrayList<>();
		List<List<Integer>> rowList = new ArrayList<>();
//		col1.add(4);
//		col1.add(3);
//		col1.add(2);
//		col1.add(-1);
//		col2.add(3);
//		col2.add(2);
//		col2.add(1);
//		col2.add(-1);
//		col3.add(1);
//		col3.add(1);
//		col3.add(-1);
//		col3.add(-2);
//		col4.add(-1);
//		col4.add(-1);
//		col4.add(-2);
//		col4.add(-3);
		col1.add(1);
		col2.add(1);
		col2.add(0);

		rowList.add(col1);
		rowList.add(col2);
//		rowList.add(col3);
//		rowList.add(col4);
//		int count = solve(rowList);
		int count = countNegativeByBinarySearch(rowList);
		System.out.println(count);
		System.out.println('z' - 'a');
		Stack<String> sc = new Stack<>();
		StringBuilder str = new StringBuilder();
		str.isEmpty();
		str.append("a");
		str.append("b");
		str.append("c");
		System.out.println(str);

		

	}
	
    static int solve(List<List<Integer>>  input){
        int n = input.size();
        int m = input.get(0).size();
        int rii = 0, cii = 0;
        int rie = 0, cie = m-1;
        int rei = n-1, cei = 0;
        int ree = n-1, cee = m-1;
        int count = 0;
        while(rii < ree || cii < cie) {
            if(input.get(rii).get(cii) < 0) {
                count = count + (rei - rii +1) * (cie - cii) + 1;
                break;
            }
            if(input.get(ree).get(cee) > 0)
                break;
            if(rii < ree && input.get(rii).get(cii) > 0 && input.get(rie).get(cie) > 0) {
                rii++; rie++;
            }
            if(input.get(rii).get(cii) > 0 && input.get(rie).get(cie) < 0) {
                count = count + (ree - rie + 1);
                cie--; cee--;
            }
            if(cii < cie && input.get(rii).get(cii) > 0 && input.get(rei).get(cei) > 0) {
                cii++; cei++;
            }
            if(input.get(rii).get(cii) > 0 && input.get(rei).get(cei) < 0) {
                count = count + (cee - cei + 1);
                rei--; ree--;
            }
        }
        return count;
    }
    
    static int getLastNegativeIndex(List<Integer> row, int start, int end) {
        if(start == end)
            return start;
        int mid = start + (end - start)/2; 

        if(row.get(mid) < 0) {
            if(mid - 1 > 0 && row.get(mid-1) > 0)
                return mid;
            return getLastNegativeIndex(row, start, mid);
        } else {
            return getLastNegativeIndex(row, mid+1, end);
        }

    }

    static int countNegativeByBinarySearch(List<List<Integer>> list) {
        int count = 0;
        for(int i = 0; i < list.size(); i++) {
            List<Integer> rowN = list.get(i);
            int colSize = rowN.size();
            int lastElement = colSize - 1;
                if(list.get(i).get(0) < 0) {
                    count = count + colSize;
                    return count;
                }                
            int lastNegative = getLastNegativeIndex(rowN, 0, lastElement);
            lastNegative = rowN.get(lastNegative) >= 0 ? colSize : lastNegative;
            count = count + (colSize - lastNegative);
        }
        return count;
    }

}
