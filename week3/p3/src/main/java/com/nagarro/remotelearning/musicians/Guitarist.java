package main.java.com.nagarro.remotelearning.musicians;

import main.java.com.nagarro.remotelearning.musicalinstruments.MusicalInstruments;

public class Guitarist extends Musician {
    public Guitarist(String name, int age, int yearsOfExperience) {
        super(name, age, yearsOfExperience);
    }

    public void hasGuitar() {
        MusicalInstruments guitar = new MusicalInstruments("Guitar", "Strings");
        System.out.println("The guitarist musical instrument is " + guitar.getName() + " and it is an instrument of the type  " + guitar.getTypeOfInstrument());
    }

    public void playGuitar() {
        System.out.println("The guitarist plays the guitar.");
    }
}
