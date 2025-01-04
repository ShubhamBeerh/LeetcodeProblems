package com.leetcode.practice.dsalgo.patterns;

import java.util.Scanner;

public class DiamondPattern {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			printDiamond(n);
		}
	}
	
	//     *
	//    * * 
	//   * * * 
	//  * * * * 
	// * * * * * 
	//  * * * *
	//   * * * 
	//    * * 
	//     *
	
	private static void printDiamond(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j<i+1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j<=i+1; j++) {
				System.out.print(" ");
			}
			for(int j=n-i-1; j >=1; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
