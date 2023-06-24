package com.nagarro.remotelearning;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Version 1 with constant hashcode
        Map<Train, List<Integer>> trainScheduler = Train.populateScheduleHashMap();
        long start = System.nanoTime();
        List<Integer> days1 = trainScheduler.get(new Train(1, "Type1", 1));
        List<Integer> days2 = trainScheduler.get(new Train(5000, "Type5000", 0));
        List<Integer> days3 = trainScheduler.get(new Train(10000, "Type10000", 0));
        long end = System.nanoTime();

        System.out.println("1st" + days1);
        System.out.println("2nd" + days2);
        System.out.println("3rd" + days3);
        long retrievalTimeFirstVersion = end - start;
        System.out.println("Retrieval time for first version (with constant hash code): " + retrievalTimeFirstVersion + "ns");

        //Version 2 with variable hashcode
        Map<Train, List<Integer>> trainModifiedScheduler = TrainModified.populateScheduleHashMap();
        start = System.nanoTime();
        days1 = trainModifiedScheduler.get(new TrainModified(1, "Type1", 1));
        days2 = trainModifiedScheduler.get(new TrainModified(5000, "Type5000", 0));
        days3 = trainModifiedScheduler.get(new TrainModified(10000, "Type10000", 0));
        end = System.nanoTime();

        System.out.println("1st" + days1);
        System.out.println("2nd" + days2);
        System.out.println("3rd" + days3);
        long retrievalTimeSecondVersion = end - start;
        System.out.println("Retrieval time for second version (with variable hash code): " + retrievalTimeSecondVersion + "ns");
        //The result of this version is better because the information is now more evenly distributed in the trees behind the hashmap

        System.out.println("The difference between the retrieval time of the first version versus the second version: " + (retrievalTimeFirstVersion - retrievalTimeSecondVersion) + "ns");
    }
}
