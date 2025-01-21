package com.leetcode.practice.dsalgo.strings;

public class AscendingNumbersInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
		System.out.println(check(str));
	}
	
    static boolean check(String s){
        int max = -1;
        for(int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);
            if((ch >= 'a' && ch<='z') || ch == ' ')
                continue;
            else {
                int val = ch - '0';
                if(max >= val)
                    return false;
                else
                    max = val;
            }
        }
        return true;
    }

}
