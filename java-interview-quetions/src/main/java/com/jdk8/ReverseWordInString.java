package com.jdk8;

import java.util.Arrays;
import java.util.stream.Collectors;

// avaJ tpecnoC fO ehT yaD
public class ReverseWordInString {

    public static void main(String[] args) {
        String str = "Java concept of the Day";
        String result = Arrays.stream(str.split(" "))
                .map(w -> new StringBuilder(w).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
