package main.java.com.nagarro.remotelearning.musicians;

import main.java.com.nagarro.remotelearning.musicians.Guitarist;

public class RhythmGuitarist extends Guitarist {

    public RhythmGuitarist(String name, int age, int yearsOfExperience) {
        super(name, age, yearsOfExperience);
    }

    public void playChords() {
        System.out.println("The rhythm guitarist plays the chords.");
    }
}
