package com.app.design.patterns.strategy;

import java.util.List;

public class OrdereInsert implements Inserter {
    @Override
    public void insert(int num, List<Integer> nums) {
        nums.add(num);
        System.out.println(" From Order-Insert ");
    }
}
