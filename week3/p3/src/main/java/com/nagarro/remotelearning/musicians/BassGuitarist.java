package main.java.com.nagarro.remotelearning.musicians;

public class BassGuitarist extends Guitarist {
    public BassGuitarist(String name, int age, int yearsOfExperience) {
        super(name, age, yearsOfExperience);
    }

    public void playLowerPitch() {
        System.out.println("The bass guitarist plays the lower pitch.");
    }
}

