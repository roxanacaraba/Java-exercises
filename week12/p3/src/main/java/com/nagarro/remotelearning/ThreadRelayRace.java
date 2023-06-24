package com.nagarro.remotelearning;

import java.util.ArrayList;
import java.util.List;

public class ThreadRelayRace implements Runnable {
    List<Thread> teams = new ArrayList<>();
    ThreadRaceContext raceContext = new ThreadRaceContext();

    public ThreadRelayRace(ThreadRaceContext raceContext) {
        this.raceContext = raceContext;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                ThreadRelayRaceTeam threadTeam = new ThreadRelayRaceTeam("Team no." + i, this.raceContext);
                Thread runnable = new Thread(threadTeam);
                teams.add(runnable);
                runnable.start();
            }

            for (int i = 1; i < 10; i++) {
                teams.get(i).join();
            }
            raceContext.printFinalScorecard();
        }
        catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
