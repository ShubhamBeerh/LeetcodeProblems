package com.leetcode.practice.dsalgo.strings;

import java.util.HashSet;
import java.util.Set;

public class VowelSubstringsOfAString {

	public static void main(String[] args) {
		System.out.println(solve("aeiouu"));
	}
	
    static int solve(String s){
        int count = 0;
        int freqArr[] = new int[26];
        freqArr[0] = -1;
        freqArr[4] = -1;
        freqArr[8] = -1;
        freqArr[14] = -1;
        freqArr[20] = -1;
        int n = s.length();
        int lastInvalidPos = -1;
        for(int i = 0 ; i < n ; i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)) {
                freqArr[ch - 'a'] = i;
                count = count + Math.max(minElement(freqArr) - lastInvalidPos, 0);
            } else {
                lastInvalidPos = i;
            }
        }
        return count;
    }

    static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    static int minElement(int[] freqArr) {
        int min = freqArr[0];
        min = Math.min(min, freqArr[4]);
        min = Math.min(min, freqArr[8]);
        min = Math.min(min, freqArr[14]);
        min = Math.min(min, freqArr[20]);
        return min;
    }

}
