package com.java.interviewproblems.asked;

public class SingletonCall {

    public static void main(String[] args) {

        SingletonClassExample  singletonClassExample = SingletonClassExample.getInstance();
        SingletonClassExample  singletonClassExample1 = SingletonClassExample.getInstance();

        System.out.println("Single ton address " + singletonClassExample.hashCode());
        System.out.println("Single1 ton address " + singletonClassExample1.hashCode());
    }
}
