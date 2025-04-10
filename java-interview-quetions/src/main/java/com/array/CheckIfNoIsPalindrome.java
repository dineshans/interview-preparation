package com.array;

// check if no is palindrome -> int number = 121
public class CheckIfNoIsPalindrome {

    public static void main(String[] args) {
        //boolean result = checkIfNumberIsPalindrome(121);
        boolean result = checkIfNumberIsPalindromeUsingString(123);
        System.out.println("Number is palindrome : " + result);
    }

    // using number approach
    public static boolean checkIfNumberIsPalindrome(int number) {
        int reverse = 0;
        int dup = number;
        while (number > 0) {
            int ld = number % 10;
            reverse = (reverse*10) + ld;
            number = number/10;
        }
        if (reverse == dup) {
            return true;
        }
        return false;
    }

    // using string conversion
    public static boolean checkIfNumberIsPalindromeUsingString(int number) {
        String str = Integer.toString(number);
        int length = str.length();
        for(int i = 0; i < length; i++) {
            if (str.charAt(i) == str.charAt(length-1)) {
                length--;
            } else {
                return false;
            }
        }
        return true;
    }
}
