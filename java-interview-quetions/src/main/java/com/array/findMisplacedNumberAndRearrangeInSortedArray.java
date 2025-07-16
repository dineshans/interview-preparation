package com.array;

/*   arr[] = [3 8 10 15 20 2] */
public class findMisplacedNumberAndRearrangeInSortedArray {

    public static void main(String[] args) {
        int[] arr = {3, 8, 10, 2, 15, 20}; // 6
        int misplacedIndex = findMisplacedNumber(arr);
        System.out.println("misplaced number is : " + arr[misplacedIndex] + " And index is : " + misplacedIndex);
        fixArray(arr, misplacedIndex);
        printArray(arr);
    }
    /*
    *  Find the misplaced number in array
    * */
    public static Integer findMisplacedNumber(int[] arr) {
        int n = arr.length;
        int misplacedNumber = -1;
        /*if (arr[n-1] < arr[n-2]) {
            misplacedNumber = arr[n-1];
            index = n-1;
            System.out.println("misplaced number is : " + misplacedNumber);
        }*/
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return i;
            }
        }
        return -1;
    }
    /*
    *  re-arrange misplaced number in array
    * */
    public static void fixArray(int[] arr, int index) {
        int j = index;
        int misplacedNumber = arr[index];
        while(j > 0 && arr[j-1] > misplacedNumber) {
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = misplacedNumber;
    }
    /*
    * print arrays
    * */
    public static void printArray(int[] arr) {
        System.out.print(" [");
        for (Integer i : arr) {
            System.out.print(" " + i);
        }
        System.out.print(" ]");
    }
}


