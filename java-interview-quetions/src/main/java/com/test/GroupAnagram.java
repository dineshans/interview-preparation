package com.test;


import java.util.*;

/*
*   Example:
    Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
    Output: [["bat"], ["nat","tan"], ["ate","eat","tea"]]
* */
public class GroupAnagram {

    public static void main(String[] args) {

        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        //List<List<String>> result = findGroupOfAnagrams(input);
        //List<List<String>> result = findGroupOfAnagramsUsingMap(input);
        List<List<String>> result = findGroupOfAnagramsOptimalApproach(input);
        //result.stream().forEach(e -> System.out.print(" " + e));
        for (List<String> group : result) {
            System.out.println(group);
        }
    }

    // O(N^2)
    public static List<List<String>> findGroupOfAnagrams(String[] strArr) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (visited[i]) {
                continue;
            }
            List<String> group = new ArrayList<>();
            group.add(strArr[i]);
            visited[i] = true;
            for (int j = i+1; j < strArr.length; j++) {
                if(!visited[j] && isAnagram(strArr[i], strArr[j])) {
                    group.add(strArr[j]);
                    visited[j] = true;
                }
            }
            result.add(group);
        }
        return result;
    }

    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }

    // Using HashMap
    // sorting O(NlogN) & O(N) for iteration  & Space is O(N)
    public static List<List<String>> findGroupOfAnagramsUsingMap(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strArr) {
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    // improved using frequency count
    public static List<List<String>> findGroupOfAnagramsOptimalApproach(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strArr) {
            String frequencyString = getFrequency(str);
            if (map.containsKey(frequencyString)) {
                map.get(frequencyString).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(frequencyString, list);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static String getFrequency(String str) {
        int[] freq = new int[26];
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        char c  = 'a';
        for (int i : freq) {
            stringBuilder.append(c);
            stringBuilder.append(i);
            c++;
        }
        return stringBuilder.toString();
    }
}
