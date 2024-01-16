package interview.problems.asked.Array;

import java.util.Arrays;

public class HighestProductOf2ElementInArray {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 6, 7, 0};
        //int[] arr = {-6, -1, -3, -4, -5};
        //productOfTwoElement(arr);
        productOf2Element(arr);


    }

    // using sorting
    public static void productOfTwoElement(int[] arr) {

        Arrays.sort(arr);

        // after sorting last two elements are the largest element
        int first = arr[arr.length - 1];
        int second = arr[arr.length - 2];

        System.out.println("Product of two element is - " + first * second);
        System.out.println("Element is - " + "  {" + first + ", " + second + " }");

    }

    // using without sorting
    // Find the first and second maximum element in array
    public static void productOf2Element(int[] arr) {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;


        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstMax) {
                firstMax = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Product of two element is - " + firstMax * secondMax);
        System.out.println("Element is - " + "  {" + firstMax + ", " + secondMax + " }");

    }
}
