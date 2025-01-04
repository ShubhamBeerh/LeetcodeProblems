package com.leetcode.practice.dsalgo.patterns;

import java.util.Scanner;

public class RectangularPattern {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int rows = sc.nextInt();
			int columns = sc.nextInt();
			printPattern(rows, columns);
		}
	}
	
	private static void printPattern(int rows, int columns) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
