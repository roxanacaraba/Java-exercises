package com.nagarro.remotelearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainModified extends Train {
    //Version 2 with variable hashcode
    public TrainModified(int trainNumber, String trainType, int numWagons) {
        super(trainNumber, trainType, numWagons);
    }
    @Override
    public int hashCode() {
        return this.getTrainNumber();
    }

    public static Map<Train, List<Integer>> populateScheduleHashMap() {
        Map<Train, List<Integer>> trainModifiedSchedule = new HashMap<>();
        for (int i = 1; i <= 10000; i++) {
            Train train = new TrainModified(i, "Type" + i, i % 10);
            List<Integer> runningDays = new ArrayList<>();
            for (int j = 1; j <= 365; j++) {
                if (Math.random() < 0.2) {  //
                    runningDays.add(j);
                }
            }
            trainModifiedSchedule.put(train, runningDays);
        }
        return trainModifiedSchedule;
    }
}
