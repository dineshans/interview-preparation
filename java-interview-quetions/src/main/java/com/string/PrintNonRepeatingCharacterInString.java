package com.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintNonRepeatingCharacterInString {

    public static void main(String[] args) {
        String str = "apple";
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
         for(char c : str.toCharArray()) {
             map.put(c, map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        System.out.print(list);
    }
}
