package com.java.interviewproblems.asked;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Find no of count for string = "ab "*/

public class FindStringOccurences {

    public static void main(String[] args) {

        String str = "]" +
                "";
        String outputStr= "ab";
       // stringCount(str, outputStr);
        getStringMatch(str, outputStr);
    }

    public static void stringCount(String str, String outputStr){

        int index = 0;
        int count = 0;

       // System.out.println("String match count " +);
        while(index != -1){

            index = str.indexOf(outputStr,index);


            if(index != -1){
                count++;
                index += outputStr.length();


            }

        }

        System.out.println("String match count " + count);



    }

    // using pattern matcher
    public static void getStringMatch(String str, String outputStr){

        int count = 0;
        Pattern pattern = Pattern.compile(outputStr);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            count += 1;
        }
        System.out.println("String match count " + count);

    }
}
