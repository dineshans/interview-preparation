package com.java.interviewproblems.asked.Array;

public class SumOf2IntegerWithoutAnyRangeAsStringInput {

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
