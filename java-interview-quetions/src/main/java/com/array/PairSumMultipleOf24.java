package com.array;

import java.util.*;

public class PairSumMultipleOf24 {

    public static List<List<Integer>> findPairs(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            /*// Skip duplicates
            if (i > 0 && arr[i] == arr[i - 1]) continue;*/
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (sum % 24 == 0) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }

    // optimal approach
    public static int countCompleteDayPairs(int[] hours) {
        int n = hours.length;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int reminder = hours[i] % 24;
            if(reminder == 0) {
                count += map.getOrDefault(reminder, 0);
            } else {
                count += map.getOrDefault(24-reminder, 0);
            }
            map.put(reminder, map.getOrDefault(reminder, 0) +1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {6, 12, 18, 24, 30, 36};
        //int[] arr = {12,12,30,24,24};
        Arrays.sort(arr);  // Ensure array is sorted
       /* List<List<Integer>> pairs = findPairs(arr);
        System.out.println(pairs.size());
        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }*/
        int resultCount = countCompleteDayPairs(arr);
        System.out.println("result is : " + resultCount);
    }
}
