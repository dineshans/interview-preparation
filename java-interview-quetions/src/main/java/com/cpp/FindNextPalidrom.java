package com.cpp;

public class FindNextPalidrom {

    public static int nextPalindromeMiddleOut(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int n = digits.length;
        // Find the middle point
        int left = (n - 1) / 2;
        int right = n / 2;
        // Mirror left half to right half
        while (left >= 0) {
            digits[right] = digits[left];
            left--;
            right++;
        }
        int candidate = Integer.parseInt(new String(digits));
        if (candidate > num) return candidate;
        // If palindrome is smaller, increment the middle and propagate
        left = (n - 1) / 2;
        right = n / 2;
        while (left >= 0 && digits[left] == '9') {
            digits[left] = digits[right] = '0';
            left--;
            right++;
        }
        if (left >= 0) {
            if (n%2 == 1) {
                digits[left]++;
                if (digits[n / 2] == '0') {
                    digits[right]++;
                }
            } else {
                digits[left]++;
                digits[right]++;
            }
        } else {
            return num + 2; // Example: 999 → 1001
        }
        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args)
    {
        int[] testCases = {125, 250, 123, 397, 4512, 1234, 1997};
        //int[] testCases = {397, 4512, 1234, 1997};
        for (int num : testCases) {
            System.out.println("Next palindrome of " + num + " is: " + nextPalindromeMiddleOut(num));
        }
    }
}
