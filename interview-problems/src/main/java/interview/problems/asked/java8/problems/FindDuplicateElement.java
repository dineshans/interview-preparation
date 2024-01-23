package interview.problems.asked.java8.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElement {

    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5, 6, 1, 2, 4};
        findDuplicateElements(integers);
    }

    public static void findDuplicateElements(Integer[] arr) {

        Set<Integer> set = new HashSet<>();

        List<Integer> duplicateElement = Arrays.stream(arr).filter(e -> !set.add(e)).collect(Collectors.toList());

        duplicateElement.stream().forEach(System.out::println);

    }
}
