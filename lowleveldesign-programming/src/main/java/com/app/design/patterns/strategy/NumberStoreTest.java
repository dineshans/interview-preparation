package com.app.design.patterns.strategy;

public class NumberStoreTest {

    public static void main(String[] args) {

       Inserter orderInserter = new OrdereInsert();
       Inserter unorderInserter = new Unorderinsert();

       Searcher linearSearcher = new LinearSearch();
       Searcher binarySearcher = new BinarySearch();

       NumberStore store = new NumberStore(orderInserter,linearSearcher);
       store.insert(4);
       store.search(4);

        NumberStore store1 = new NumberStore(unorderInserter,binarySearcher);
        store1.insert(2);
        store1.search(2);
    }
}
