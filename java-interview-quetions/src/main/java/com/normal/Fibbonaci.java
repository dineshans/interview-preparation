package com.normal;

/* 0, 1, 1, 2, 3, 5, 8 */
public class Fibbonaci {

    public static void main(String[] args) {
        int N = 10;
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci searise of " + N + " number '");
        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            int next = a+b;
            a = b;
            b = next;
        }
    }
}
