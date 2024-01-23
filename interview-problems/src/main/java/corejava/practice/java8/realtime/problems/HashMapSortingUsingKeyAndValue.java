package corejava.practice.java8.realtime.problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSortingUsingKeyAndValue {

    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);

        System.out.println("Before sorting - " + studentMap);

        // Sort Hashmap using key
        LinkedHashMap<String, Integer> sortedMapByKey = studentMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println("After sorting - " + sortedMapByKey);

        // Sort Hashmap using Value
        LinkedHashMap<String, Integer> sortedMapByValue = studentMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("After sorting - " + sortedMapByValue);
    }
}
