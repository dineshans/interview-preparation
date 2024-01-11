package org.example;

import java.math.BigInteger;

/**
 * Hello world!
 *
 */

/*

initial Problem Statement (~30 min)
Write a function, add, which adds two large numbers together and returns their sum:

// Returns sum of two numbers
String add(String a, String b)

Inputs to the add function are two numbers, represented as strings
Output of the add function is a single string representing the sum of the inputs
Only positive integers need to be supported
Input numbers can be very large, with 100 digits or more. This negates the ability to convert the entirety of the strings to integers and simply add them together in a 32-bit system.
Do’s and Don’ts

Don’t make use of any existing BigInteger packages or other construct which allows you to convert the entire input numbers to integers, natively add them, and convert back to strings. The point of this problem is to implement addition on a digit-by-digit basis.
Internet use for syntax is OK but please don’t copy solutions
Think out loud! Describe your approach and discuss changes as new information surfaces
Test-Driven Development is preferred. It is highly recommended to create a test runner function, assertAdd, which takes 3 inputs and displays whether the add function returns the third parameter when invoked with the first two parameters

// Asserts 'add' operating correctly
void assertAdd(String a, String b, String expectedSum)
Prasanna Venkatesan Varadhan1:04 PM
Sample Inputs and Outputs:
// Basic Test
assertAdd("1", "5", "6");
assertAdd("301", "5", "306");

*/

public class App {
    public static void main(String[] args) {

       // System.out.println("Hello World!");

        String result = addTwoNumber("1", "2");
        System.out.println("result is " + result);

    }

    public static String addTwoNumber(String a, String b) {

        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        int reminder = 0;
        int sum = 0;

        int charALength = charA.length;
        int charBLength = charB.length;

        if (charALength <= charBLength) {
                for (int i = charBLength - 1; i >= 0; i--) {

                    sum = charA[i] - '0' + charB[i] - '0' + reminder;
                    reminder = 0;
                    if (sum % 10 != 0) {
                        reminder = sum / 10;
                    }
                }

            }
        return String.valueOf(sum);

    }
}



