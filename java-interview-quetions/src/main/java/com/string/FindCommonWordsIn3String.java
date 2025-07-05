package com.string;
import java.util.*;

/*
 *  Given 3 strings, find the common words in each string
 * if one string have hello 1-time then hello
 * will be count when its occurs 1-time in each 2-another strings
 * */
public class FindCommonWordsIn3String {

    public static void main(String[] args) {
        String s1 = "Hello Dinesh hello";
        String s2 = "Hello Dinesh I am not good";
        String s3 = " Hello Dinesh ok";
        // Convert to lowercase and split into words
        Map<String, Integer> map1 = getWordCount(s1.toLowerCase());
        Map<String, Integer> map2 = getWordCount(s2.toLowerCase());
        Map<String, Integer> map3 = getWordCount(s3.toLowerCase());
        Set<String> commonWords = new HashSet<>(map1.keySet());
        commonWords.retainAll(map2.keySet());
        commonWords.retainAll(map3.keySet());
        for (String word : commonWords) {
            int minCount = Math.min(map1.get(word), Math.min(map2.get(word), map3.get(word)));
            for (int i = 0; i < minCount; i++) {
                System.out.println(word);
            }
        }
    }
    private static Map<String, Integer> getWordCount(String str) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : str.trim().split("\\s+")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
}
