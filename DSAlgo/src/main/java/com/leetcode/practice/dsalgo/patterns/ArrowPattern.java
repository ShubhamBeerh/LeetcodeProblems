package com.leetcode.practice.dsalgo.patterns;

import java.util.Scanner;

public class ArrowPattern {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			printRightArrowPattern(n);
			printLeftArrowPattern(n);
		}
	}
	
	private static void printRightArrowPattern(int n) {
		for(int i = 0; i < 2*n-1; i++) {
			int stars = i+1;
			if(i>=n)
				stars = 2*n-i-1;
//			for(int j = n-stars; j >0; j--) {
//				System.out.print(" ");
//			}
			for(int j = 0; j < stars; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	private static void printLeftArrowPattern(int n) {
		for(int i = 0; i < 2*n-1; i++) {
			int stars = i+1;
			if(i>=n)
				stars = 2*n-i-1;
			for(int j = n-stars; j >0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < stars; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}