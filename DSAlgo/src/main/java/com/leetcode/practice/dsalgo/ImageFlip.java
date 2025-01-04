package com.leetcode.practice.dsalgo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImageFlip {

	public static void main(String[] args) {
		List<List<Integer>> input = new ArrayList<List<Integer>>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<4; i++) {
			List<Integer> arrList = new ArrayList<Integer>();
			for(int j = 0; j<4;j++) {
				arrList.add(sc.nextInt());
			}
			input.add(arrList);
		}
		System.out.println(input);
        int n = input.size();
        int endColIndex = n-1;
        int startColIndex = 0;
        List<List<Integer>> newList = new ArrayList<List<Integer>>();
        for(int i = endColIndex; i>=0; i--) {
        	List<Integer> modifiedList =  new ArrayList<Integer>();
            for(int j = 0; j<n; j++) {
            	modifiedList.add(inverseNumber(input.get(j).get(i)));
//                newList.get(j).set(n-1-i, inverseNumber(input.get(j).get(i)));
            }
            newList.add(modifiedList);
        }
        
        System.out.println(newList);
        
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
//            	modifiedList.add(inverseNumber(input.get(j).get(i)));
                input.get(i).set(j, newList.get(j).get(i));
            }
        }
        System.out.println(input);
    }

    private static int inverseNumber(int n) {
        return n==0 ? 1 : 0;
    }

}
