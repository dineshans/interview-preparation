package com.app.design.patterns.strategy;

import java.util.List;

public class BinarySearch implements Searcher {
    @Override
    public Integer search(int key, List<Integer> nums) {
        System.out.println(" From Binary-Searcher ");

        return 1;
    }
}
