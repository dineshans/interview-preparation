package strategy;

import java.util.List;

public class Unorderinsert implements Inserter {
    @Override
    public void insert(int num, List<Integer> nums) {
        nums.add(num);
        System.out.println(" From Unorder-inserter ");
    }
}
