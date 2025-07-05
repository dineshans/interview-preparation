package com.string;

import java.util.HashSet;
import java.util.Set;

public class FIndLongestSubStringWithoutRepeating {

    public static void main(String[] args) {

        String str = "abcabcbb"; // out - [abc, bca, cba]

        int length =  longestSubString(str);
        System.out.println("max length is " + length);

    }

    public static int longestSubString(String str) {

        int strlength = str.length();
        int maxlength = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();

        for(int right = 0; right < strlength; right++) {

            if(!set.contains(str.charAt(right))){

                set.add(str.charAt(right));

                maxlength = Math.max(maxlength, right - left+1);

            } else {
                while (set.contains(str.charAt(right))) {
                    set.remove(str.charAt(left));
                    left++;
                }
                set.add(str.charAt(right));
            }

        }

        return maxlength;

    }
}
