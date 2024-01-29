package interview.problems.asked.java8.problems.String;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacterInString {

    public static void main(String[] args) {

        String str = "Java is awesome java awesome";

        // Approach - 1
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(Character ch : str.toCharArray()){

            map.put(ch, map.containsKey(ch) ? map.get(ch)+1:1);

        }
        List<Map.Entry<Character,Integer>> list = map.entrySet().stream().filter(e -> e.getValue() == 1).collect(Collectors.toList());

        //list.forEach(System.out::println);
        // Approach - 2
        str.chars().mapToObj(c -> Character.valueOf((char)c)).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
