package org.bhushan.lld120072024.LLD1_Class7.callables.mergeSortWithExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class MergeSorter implements Callable<List<Integer>>{

    private List<Integer> arrayToSort;
//    private ExecutorService executorService;
    public MergeSorter(List<Integer> arrayToSort)
    {
        this.arrayToSort = arrayToSort;
//        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size() <= 1 ){
            return arrayToSort;
        }
        int mid = arrayToSort.size()/2;
        List<Integer> leftArray = new ArrayList<>();
        for(int i = 0; i < mid; i++){
            leftArray.add(arrayToSort.get(i));
        }

        List<Integer> rightArray = new ArrayList<>();
        for(int i = mid; i < arrayToSort.size(); i++){
            rightArray.add(arrayToSort.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftArray);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray);


//        List<Integer> leftSortedArray = leftMergeSorter.call();
//        List<Integer> rightSortedArray = rightMergeSorter.call();

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightMergeSorter);


        //Merge both sorted arrays
        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();
        List<Integer> sortedArray = new ArrayList<>();
        int i = 0 ;
        int j = 0;
        while(i < leftSortedArray.size() && j < rightSortedArray.size()){
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                ++i;
            }
            else{
                sortedArray.add(rightSortedArray.get(j));
                ++j;
            }
        }


        // Add remaining elements
        while(i < leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
            ++i;
        }
        while(j < rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j));
            ++j;
        }

        return sortedArray;
    }
}