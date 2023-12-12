package com.java.interviewproblems;

public class SingletonClassExample {

    private static SingletonClassExample singletonClassExample;

    private SingletonClassExample() {

    }

    public static synchronized SingletonClassExample getInstance() {

        if (singletonClassExample == null) {

            singletonClassExample = new SingletonClassExample();


            }


        return singletonClassExample;
    }
}
