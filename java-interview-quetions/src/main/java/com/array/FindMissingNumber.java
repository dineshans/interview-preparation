package com.array;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {0,1,2,4}; // missing number is 3
        missingNumber(arr);
    }

    public static  void missingNumber(int[] arr) {
        int n = arr.length;
        int totalNumberSum = n*(n+1)/2;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int missingNumber = totalNumberSum-sum;
        System.out.println("Missing number is : " + missingNumber);
    }
}
