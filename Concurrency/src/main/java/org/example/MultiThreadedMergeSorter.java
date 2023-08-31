package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadedMergeSorter implements Callable<List<Integer>> {

    List<Integer> list;

    public MultiThreadedMergeSorter(List<Integer> list){
        this.list = list;
    }


    @Override
    public List<Integer> call() throws Exception {
        int l = 0;
        int r = list.size()-1;

        int mid = l+(r-l)/2;

        if(l>=r){
            return list;
        }

        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        for(int i=0;i<=mid;i++){
            leftList.add(list.get(i));
        }

        for(int i=mid+1;i<=r;i++){
            rightList.add(list.get(i));
        }

        ExecutorService leftExecutorService = Executors.newSingleThreadExecutor();
        Future<List<Integer>> futureLeftSortedList = leftExecutorService.submit(new MultiThreadedMergeSorter(leftList));
        ExecutorService rightExecutorService = Executors.newSingleThreadExecutor();
        Future<List<Integer>> futureRightSortedList = rightExecutorService.submit(new MultiThreadedMergeSorter(rightList));

        List<Integer> leftSortedList = futureLeftSortedList.get();
        List<Integer> rightSortedList = futureRightSortedList.get();

        List<Integer> finalSorted = new ArrayList<>();
        int i=0,j=0;

        while (i<leftSortedList.size() && j<rightSortedList.size()){

            int min = Math.min(leftSortedList.get(i),rightSortedList.get(j));
            if(min == leftSortedList.get(i)){
                i++;
            }else {
                j++;
            }
            finalSorted.add(min);
        }

        while (i<leftSortedList.size()){
            finalSorted.add(leftSortedList.get(i));
            i++;
        }

        while (j<rightSortedList.size()){
            finalSorted.add(rightSortedList.get(j));
            j++;
        }
        return finalSorted;
    }
}
