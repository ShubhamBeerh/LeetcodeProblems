package com.leetcode.practice.dsalgo.strings;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bosscoder quiz practice code";
		System.out.println(reverseInPlace(str));
	}
	
    static String reverseInPlace(String s) {
        StringBuilder str = new StringBuilder(s);
        int n = str.length();
        int i = 0;
        str.reverse();
        for(int l = 0; l < n; ++l) {
            if(str.charAt(l)!=' ') {
                if (i!=0) {
                    str.setCharAt(i++, ' ');
                }
                int r = l;
                while(r<n && str.charAt(r) != ' ') {
                    str.setCharAt(i++, str.charAt(r++));
                }
                int start = i-(r-l);
                int end = i-1;
                while(start < end) {
                    char temp = str.charAt(start);
                    str.setCharAt(start, str.charAt(end));
                    str.setCharAt(end, temp);
                    start++; end--;
                }
                l = r;
            }
        }
        return str.substring(0, i);
    }

}
