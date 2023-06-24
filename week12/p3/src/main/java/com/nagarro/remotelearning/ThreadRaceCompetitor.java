package com.nagarro.remotelearning;

public class ThreadRaceCompetitor implements Runnable {
    private String nameOfTeam;
    private String nameOfCompetitor;
    private ThreadRaceContext raceContext;

    public ThreadRaceCompetitor(String nameOfCompetitor, String nameOfTeam, ThreadRaceContext raceContext) {
        this.nameOfCompetitor = nameOfCompetitor;
        this.nameOfTeam = nameOfTeam;
        this.raceContext = raceContext;
    }

    public String getNameOfTeam() {
        return nameOfTeam;
    }

    public void setNameOfTeam(String nameOfTeam) {
        this.nameOfTeam = nameOfTeam;
    }

    public String getNameOfCompetitor() {
        return nameOfCompetitor;
    }

    public void setNameOfCompetitor(String nameOfCompetitor) {
        this.nameOfCompetitor = nameOfCompetitor;
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.nameOfCompetitor + " starts the race");
        raceContext.validateOrderOfCompetitors(this);
    }
}
