package com.nagarro.remotelearning;

import java.util.ArrayList;
import java.util.List;

public class ThreadRaceContext {
    private List<Integer> scoreCard = new ArrayList<>();

    public synchronized void addCompetitorToScoreCard(ThreadRaceCompetitor competitor) {
            this.scoreCard.add(competitor.getId());
        }

    public void listRankings() {
        System.out.println("The final scorecard is: " + this.scoreCard);
    }
}
