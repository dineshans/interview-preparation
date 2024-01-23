package corejava.practice.java8.realtime.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNoOfOccurencesInHashMap {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,5,7,8,9,2,1,4,4,5);

        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        map.forEach((k,v) -> {System.out.println("key - " + k + "  And  Occurence - " + v);});

    }
}
