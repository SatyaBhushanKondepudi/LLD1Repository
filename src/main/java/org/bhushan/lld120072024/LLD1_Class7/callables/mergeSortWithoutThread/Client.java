package org.bhushan.lld120072024.LLD1_Class7.callables.mergeSortWithoutThread;

import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = List.of(7 , 6 ,3, 10 , 1 , 2, 5, 8, 4 , 9);
        MergeSorter mergeSorter = new MergeSorter(numbers);
        List<Integer> sortedList = mergeSorter.call();
        System.out.println(sortedList);
    }
}
