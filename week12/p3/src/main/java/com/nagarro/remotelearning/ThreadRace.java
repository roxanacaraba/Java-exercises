package com.nagarro.remotelearning;

public class ThreadRace {
    public static void main(String[] args) throws InterruptedException {
    ThreadRaceContext raceContext = new ThreadRaceContext();
    Thread t = new Thread(new ThreadRelayRace(raceContext));
    t.start();
    }
}
