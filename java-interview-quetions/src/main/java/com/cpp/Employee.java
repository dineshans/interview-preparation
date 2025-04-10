package com.cpp;

import java.util.*;

public class Employee {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> oddList = list.stream().filter(i -> i%2 == 1).toList();
        List<Integer> evenList = list.stream().filter(i -> i%2 == 0).toList();
        oddList.forEach(e -> System.out.print("  " + e));
        System.out.println();
        evenList.forEach(e -> System.out.print("  " + e));

        Employee employee = new Employee();
        /*if (employee instanceof Objects) {

        }*/

      //list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    }
}
