package interview.problems.asked.java8.problems.String;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatingCharaterFromString {

    public static void main(String[] args) {

        String str = "Java is awesome java awesome";

        str.chars().mapToObj(c -> Character.valueOf((char)c)).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(System.out::println);
    }
}
