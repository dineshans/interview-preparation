package strategy;

import java.util.List;

public class LinearSearch implements Searcher {
    @Override
    public Integer search(int key, List<Integer> nums) {
        System.out.println(" From Linear-Searcher ");

        return 1;
    }
}
