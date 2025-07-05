package com.array;

import java.util.Stack;

public class NextGreaterElement {

    public static void main (String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] resultArr = nextGreaterElement(arr);
        for (int i : resultArr) {
            System.out.println(i);
        }
    }

    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }
}
