package com.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNoOfOccurrencesUsingJava8 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,4,2,5);
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        //map.entrySet().stream().forEach(System.out::println);
        // One way to print with message in SOP statrement
        map.forEach((k,v) -> {System.out.println("Key is - " + k + "  Occurence- " + v);});
    }
}
