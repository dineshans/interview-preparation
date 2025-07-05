package com.jdk8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaxRepeatingWordInStringArray {

    public static void main(String[] args) {

        String[] strArr = {"Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil"};
        Map<String, Long> map = Arrays.stream(strArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(entry -> System.out.println(entry.getKey()));
    }
}
