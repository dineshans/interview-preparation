package com.array;

public class FindValidPairesEqualToSum {
    public static void main(String[] args) {

        int[] arr = {0,2,7,8,5,6};
        int a = 7; // 2,5 --> true, 0+7 -> 7, 0,2,5 -->
        boolean result = isPairesValid(arr, a);
        System.out.println("Is paired found : " + result);
    }

    // o(n^2)
    public static boolean isPairesValid(int[] arr, int a) {
        int n = arr.length;
        int counter = 0;
        for(int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] + arr[j] == a) {
                    counter++;
                }
            }
        }
        if(counter == 1) {
            return true;
        }
        return false;
    }

    // using hash map

    //
}