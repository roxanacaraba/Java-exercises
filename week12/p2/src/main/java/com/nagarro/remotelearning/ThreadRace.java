package com.nagarro.remotelearning;

import java.util.ArrayList;
import java.util.List;

public class ThreadRace {
    public static void main(String[] args) throws InterruptedException {
        int i;
        List<Thread> raceCompetitors = new ArrayList<>();
        ThreadRaceContext raceContext = new ThreadRaceContext();

        for (i = 1; i <= 10; i++) {
            ThreadRaceCompetitor runnable = new ThreadRaceCompetitor(i, raceContext);
            Thread t = new Thread(runnable);
            raceCompetitors.add(t);
        }
        for (Thread thread : raceCompetitors) {
            thread.start();
        }
        for (Thread thread : raceCompetitors) {
            thread.join();
        }
        raceContext.listRankings();
    }
}
