package com.java.interviewproblems.asked.Array;

/* Write a function which adds two positive  integers , these Strings can be very long (length up to 100)

        String add(String a, String b) {

        Test Cases - 1
        Input a = “1” b = “989”
        Output = “990”

        Test Case - 2
        Input a = "728128128712718271827", b = "20"
        OutPut = "728128128712718271847"
    */

import java.math.BigInteger;

public class SumOfNumberInputAsString {

    public static void main(String[] args) {

        String sumOfNumber = add("728128128712718271827","20"); // 728128128712718271847
        System.out.println("Sum of Number is " + sumOfNumber);

    }

    public static String add(String a, String b) {

        String result = null;

        int lengthOfA = a.length();
        int lengthOfB = b.length();

        int totalLengthOfStr = lengthOfA + lengthOfB;

        System.out.println("totalLengthOfStr is " + totalLengthOfStr);

        /* In this case if we send second test case then it will give number format exception */
        //int _a = Integer.parseInt(a);
        //int _b = Integer.parseInt(b);
        // int sum = _a + _b;

        /* To resolve number format exception use BigInterger as below */
        BigInteger _a = new BigInteger(a);
        BigInteger _b = new BigInteger(b);
        BigInteger sum =  _a.add(_b);

        result = String.valueOf(sum);

        return result;
    }
}
