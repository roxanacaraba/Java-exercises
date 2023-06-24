package com.nagarro.remotelearning;

public class ThreadRaceCompetitor implements Runnable {
    private int id;
    private ThreadRaceContext raceContext;

    public ThreadRaceCompetitor(int id, ThreadRaceContext raceContext) {
        this.id = id;
        this.raceContext = raceContext;
    }

    public int getId() {
        return id;
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.id + " finished the race.");
            this.raceContext.addCompetitorToScoreCard(this);
    }
}
