package com.array;

/*
*  int [] a = {1,4,-1,6}
target = 5

O/p : (1,4) (-1,6)
*
* */

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {1,4,-1,6, 7,8,9};
        int target = 5;
        findTargetSumOptimal(arr, target);
    }
    //O(n^2)
    public static void findTargetSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.print("(" + arr[i] + ", " + arr[j] + " )");
                }
            }
        }
    }
    // O(n) & O(n)
    public static void findTargetSumOptimal(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        System.out.print("Target sum is: ");
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int remaining = target-current;
            if (map.containsKey(remaining)) {
               /*int a = Math.min(current, remaining);
               int b = Math.max(current, remaining);*/
               //set.add("( " + a + ", " + b + ")");
                set.add("( " + remaining + ", " + current + ")");
            }
            map.put(current, i);
        }
        for (String i : set) {
            System.out.print(i);
        }
        System.out.println();
    }
}
