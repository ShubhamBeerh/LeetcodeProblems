package com.leetcode.practice.dsalgo.strings;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println(check(str));

	}
	
	static boolean check(String s){
			int[] freqArr = new int[26];
	        for(int i = 0; i<s.length(); i++) {
	            char ch = s.charAt(i);
	            if(ch >= 65 && ch <= 90) {
	                ch = (char) (ch + 32);
	            } else if (ch == ' ') {
	            	continue;
	            }
	            int index = ch - 97;
	            freqArr[index] = 1;
	        }
	        for(int i = 0; i < freqArr.length; i++) {
	            if(freqArr[i] == 0)
	                return false;
	        }
	        return true;
	    }

}
