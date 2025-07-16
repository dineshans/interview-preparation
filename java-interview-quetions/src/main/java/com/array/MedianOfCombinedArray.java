package com.array;



public class MedianOfCombinedArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 10, 34, 56, 78};
        int[] arr2 = {2, 3, 9, 23, 67, 89};
        // o/p = 1,2,3,9,10,23,34,56,67,78, 89
        int result = findMedianOfCombinedArr(arr1, arr2);
        System.out.println("Median of array is : " + result);
    }
    public static int findMedianOfCombinedArr(int[] A, int[] B) {
        if (A.length > B.length) {
            findMedianOfCombinedArr(B,A);
        }
        int m = A.length;
        int n = B.length;
        int totalLeft = (m+n+1) / 2; // 6
        int low = 0;
        int high = m;
        int result = 0;
        while (low <= high)  {
            int i = (low+high) / 2; // i =  2
            int j = totalLeft-1; // 6-1 = 5
            int ALeft = (i == 0) ? Integer.MIN_VALUE : A[i-1]; // 10
            int ARight = (i == m) ? Integer.MAX_VALUE : A[i]; // 34
            int BLeft = (j == 0) ? Integer.MIN_VALUE : B[j-1]; //  67
            int BRight = (j == n) ? Integer.MAX_VALUE : B[j]; // 89
            if (ALeft <= BRight && BLeft <= ARight) { // 10 <= 89 && 67 <= 34
                if ((m+n) % 2 == 0) {
                    result = Math.max(ALeft, BLeft) + Math.min(ARight, BRight) / 2;
                } else {
                    result =  Math.max(ALeft, BLeft);
                }
            } else if (ALeft > BRight) {
                high = i-1;
            } else {
                low = i+1;
            }
        }
        return result;
    }
}
