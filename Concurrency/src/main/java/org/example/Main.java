package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(2,1);

        MergeSorter mergeSorter = new MergeSorter(list);

        List<Integer> sortedList = mergeSorter.call();

        System.out.println(sortedList);
    }
}