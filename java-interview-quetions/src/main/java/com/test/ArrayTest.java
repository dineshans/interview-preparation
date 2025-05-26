package com.test;

/*
* Sort an array of 0s, 1s and 2s

Input: arr[] = {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}
Explanation: {0, 0, 1, 1, 2, 2} has all 0s first, then all 1s and all 2s in last.

Input: arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
Explanation: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2} has all 0s first, then all 1s and all 2s in last
*
* */

public class ArrayTest {

    public void sortArr(int[] arr) {
        int zeroCounts = 0;
        int oneCounts = 0;
        int twoCounts = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCounts++;
            } else if (arr[i] == 1) {
                oneCounts++;
            } else {
                twoCounts++;
            }
        }
        for (int i = 0; i < zeroCounts; i++) {
            arr[i] = 0;
        }
        for (int i = zeroCounts+1; i < zeroCounts+oneCounts; i++) {
            arr[i] = 1;
        }
        for (int i = oneCounts+1; i < oneCounts+twoCounts; i++) {
            arr[i] = 2;
        }
    }

}
