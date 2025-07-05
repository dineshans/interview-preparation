package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*
* Find All Anagrams in a String
* Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
* Input: s = "cbaebabacd", p = "abc"
* Output: [0,6]
* */
public class FindAllStartIndexForAnagramStr {

    public static void main(String[] args) {
        //String s = "cbaebabacd";
        //String p = "abc";
        String s = "abab";
        String p = "ab";
        List<Integer> result = getAnagrams(s, p);
        System.out.print("[");
        for(Integer index : result) {
            System.out.print(" " + index);
        }
        System.out.print(" ]");
    }
    public static List<Integer> getAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s.length() < p.length()) {
            return result;
        }
        String sortedPStr = sortAnagramString(p);
        int pLength = p.length();
        for(int i = 0; i <= s.length() - pLength; i++) {
            String sub = s.substring(i, i + pLength);
            if(sortAnagramString(sub).equalsIgnoreCase(sortedPStr)) {
                result.add(i);
            }
        }
        return result;

    }
    private static String sortAnagramString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
