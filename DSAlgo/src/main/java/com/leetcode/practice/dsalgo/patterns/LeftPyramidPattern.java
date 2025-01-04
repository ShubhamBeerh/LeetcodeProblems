package com.leetcode.practice.dsalgo.patterns;

import java.util.Scanner;

public class LeftPyramidPattern {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			printLeftPyramid(n);
			printLeftPyramidNumberPattern(n);
			printLeftPyramidSameNumberPattern(n);
			printLeftPyramidUpsideDownPattern(n);
		}
	}
	
	private static void printLeftPyramid(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	private static void printLeftPyramidNumberPattern(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= i+1; j++) {
				System.out.print(j+ " ");
			}
			System.out.println("");
		}
	}
	
	private static void printLeftPyramidSameNumberPattern(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= i+1; j++) {
				System.out.print(i+1+ " ");
			}
			System.out.println("");
		}
	}
	
	private static void printLeftPyramidUpsideDownPattern(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
