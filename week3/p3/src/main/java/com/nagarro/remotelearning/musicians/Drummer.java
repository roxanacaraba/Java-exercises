package main.java.com.nagarro.remotelearning.musicians;

import main.java.com.nagarro.remotelearning.musicalinstruments.MusicalInstruments;

public class Drummer extends Musician {

    public Drummer(String name, int age, int yearsOfExperience) {
        super(name, age, yearsOfExperience);
    }

    public void hasDrumset() {
        MusicalInstruments drumSet = new MusicalInstruments("Drum Set", "Percussion");
        System.out.println("The drummer musical instrument is " + drumSet.getName() + " and it is an instrument of the type  " + drumSet.getTypeOfInstrument());
    }
    public void playDrums() {
        System.out.println("The drummer plays the drums.");
    }
}
