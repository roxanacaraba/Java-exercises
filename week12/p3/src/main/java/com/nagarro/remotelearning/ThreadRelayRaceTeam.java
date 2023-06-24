package com.nagarro.remotelearning;

import java.util.ArrayList;
import java.util.List;

public class ThreadRelayRaceTeam implements Runnable {
    private List<Thread> raceCompetitors = new ArrayList<>();
    private ThreadRaceContext threadRaceContext;
    private String nameOfTeam;

    public ThreadRelayRaceTeam(String nameOfTeam, ThreadRaceContext threadRaceContext) {
        this.nameOfTeam = nameOfTeam;
        this.threadRaceContext = threadRaceContext;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                ThreadRaceCompetitor threadCompetitor = new ThreadRaceCompetitor("Competitor no." + i + " from team " + this.nameOfTeam, this.nameOfTeam, this.threadRaceContext);
                Thread runnable = new Thread(threadCompetitor);
                raceCompetitors.add(runnable);
                runnable.start();
            }

            for (int i = 0; i < 4; i++) {
                raceCompetitors.get(i).join();
            }

            threadRaceContext.validateOrderOfTeams(this);
        }
        catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public String getNameOfTeam() {
        return this.nameOfTeam;
    }
}


