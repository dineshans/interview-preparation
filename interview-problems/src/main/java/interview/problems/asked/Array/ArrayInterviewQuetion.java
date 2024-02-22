package interview.problems.asked.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
* Second largest element using stream API
*
* non unique element from array without using any collection and stream API
*
* Third highest salary from employee table
*
* */
public class ArrayInterviewQuetion {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,8,3,6,3,11,2);
        int[] arr = {2,3,8,3,6,3,11,2};
        findSecondLargestElement(list);
        nonUniqueElement(arr);
    }

    public static void findSecondLargestElement(List<Integer> list) {

        int  secondLargestElement = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second Largest Element is : " + secondLargestElement);
    }

    public static void nonUniqueElement(int[] arr) {

        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        int count = 0;

        for(int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[j] == arr[k]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Non Unique Element is : " + arr[j]);
                System.out.println("Non Unique Element is : " + arr[j]);
            }
            count = 0;
         }
     }
}
