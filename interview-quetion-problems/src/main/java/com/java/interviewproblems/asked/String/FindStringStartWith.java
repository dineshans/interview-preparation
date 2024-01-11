package com.java.interviewproblems.asked.String;


/* Find string start with do, in string array */
public class FindStringStartWith {

    public static void main(String[] args) {

        String[] arr = {"doone", "doas", "apple", "zone"};

        String x = "do";

        String[] result = findStringStartWith(arr, x);

        System.out.print(" " + "[");
        for(int i = 0; i < result.length; i++){
            System.out.print(" " + result[i]);
        }
        System.out.print(" " + "]");
    }
    
    public static String[] findStringStartWith(String[] arr, String x){
        
        String[] result = new String[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(arr[i].startsWith(x)){
              result[i] = arr[i];

            }
        }
        
        return result;

    }
}
