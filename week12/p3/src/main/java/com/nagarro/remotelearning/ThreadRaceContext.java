package com.nagarro.remotelearning;

import java.util.*;

public class ThreadRaceContext {
    private Queue<String> scoreCard = new LinkedList<>();

    public synchronized void validateOrderOfCompetitors(ThreadRaceCompetitor competitor) {
            System.out.println(competitor.getNameOfCompetitor() + " finished the race.");
        }

    public synchronized void validateOrderOfTeams(ThreadRelayRaceTeam team) {
        System.out.println(team.getNameOfTeam() + " finished the race.");
        scoreCard.add(team.getNameOfTeam());
    }

    public void printFinalScorecard() {
        System.out.println("The final scorecard is:");
        System.out.println("First place: " + scoreCard.poll());
        System.out.println("Second place: " + scoreCard.poll());
        System.out.println("Third place: " + scoreCard.poll());
    }
}
