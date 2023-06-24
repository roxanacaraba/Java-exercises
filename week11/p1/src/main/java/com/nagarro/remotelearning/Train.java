package com.nagarro.remotelearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Train {
    //Version 1 with constant hashcode
    private int trainNumber;
    private String trainType;
    private int numWagons;

    public Train(int trainNumber, String trainType, int numWagons) {
        this.trainNumber = trainNumber;
        this.trainType = trainType;
        this.numWagons = numWagons;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Train)) return false;
        Train t = (Train) o;
        return t.trainNumber == this.trainNumber &&
                t.trainType.equals(this.trainType) &&
                t.numWagons == this.numWagons;
    }

    @Override
    public int hashCode() {
        return 3;
    }

    public static Map<Train, List<Integer>> populateScheduleHashMap() {
        Map<Train, List<Integer>> trainSchedule = new HashMap<>();
        for (int i = 1; i <= 10000; i++) {
            Train train = new Train(i, "Type" + i, i % 10);
            List<Integer> runningDays = new ArrayList<>();
            for (int j = 1; j <= 365; j++) {
                if (Math.random() < 0.2) {
                    runningDays.add(j);
                }
            }
            trainSchedule.put(train, runningDays);
        }
        return trainSchedule;
    }
}
