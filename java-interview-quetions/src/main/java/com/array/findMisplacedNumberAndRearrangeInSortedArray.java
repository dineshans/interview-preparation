package com.array;

/*   arr[] = [3 8 10 15 20 2] */
public class findMisplacedNumberAndRearrangeInSortedArray {

    public static void main(String[] args) {
        int index = -1;
        int[] arr = {3, 8, 10, 2, 15, 20}; // 6
        findMisplacedNumber(arr);
        System.out.print(" [ ");
        for (Integer i : arr) {
            System.out.print(" " + i);
        }
        System.out.print("  ] ");
    }

    public static void findMisplacedNumber(int[] arr) {
        int n = arr.length;
        int index = -1;
        int misplacedNumber = -1;
        if (arr[n-1] < arr[n-2]) {
            misplacedNumber = arr[n-1];
            index = n-1;
            System.out.println("misplaced number is : " + misplacedNumber);
        }
        for(int i = 1; i < arr.length-1; i++) {
            if (arr[i] < arr[i-1]) {
                misplacedNumber = arr[i];
                index = i;
                break;
            }
        }
        System.out.println("misplaced number is : " + misplacedNumber);
        // correct the array
        int j = index;
        while(j > 0 && arr[j-1] > misplacedNumber) {
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = misplacedNumber;
    }
}


