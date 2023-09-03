package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(1,5,3,2,8,9,11,2,12,13,4,42,15);


        MultiThreadedMergeSorter mergeSorter = new MultiThreadedMergeSorter(list);

        List<Integer> sortedList = mergeSorter.call();


        System.out.println(sortedList);
    }
}