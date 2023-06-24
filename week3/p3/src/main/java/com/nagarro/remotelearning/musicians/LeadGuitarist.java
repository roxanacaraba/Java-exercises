package main.java.com.nagarro.remotelearning.musicians;

public class LeadGuitarist extends Guitarist {
    public LeadGuitarist(String name, int age, int yearsOfExperience) {
        super(name, age, yearsOfExperience);
    }

    public void playGuitarSolos() {
        System.out.println("The lead guitarist plays the guitar solos.");
    }
}
