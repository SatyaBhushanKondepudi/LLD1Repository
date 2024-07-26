package org.bhushan.lld120072024.LLD1_Class7.callables.mergeSortWithExecutor;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = List.of(7 , 6 ,3, 10 , 1 , 2, 5, 8, 4 , 9);
        ExecutorService executorService = Executors.newCachedThreadPool();
//        MergeSorter mergeSorter = new MergeSorter(numbers , executorService);
        MergeSorter mergeSorter = new MergeSorter(numbers);
        Future<List<Integer>> sortedListFuture = executorService.submit(mergeSorter);
//        List<Integer> sortedList = mergeSorter.call();
        //get on future is blocking
        System.out.println(sortedListFuture.get());
    }
}
