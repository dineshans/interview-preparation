package com.app.design.patterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class NumberStore {

    private final Inserter inserter;
    private final Searcher searcher;

    private List<Integer> nums;

    public NumberStore(Inserter inserter, Searcher searcher){

        this.inserter = inserter;
        this.searcher = searcher;
        nums = new ArrayList<>();
    }

    public void insert(int num) {

        this.inserter.insert(num,nums);
    }

    public void search(int key){
        this.searcher.search(key,nums);
    }
}
