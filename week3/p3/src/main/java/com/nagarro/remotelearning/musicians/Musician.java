package main.java.com.nagarro.remotelearning.musicians;

import main.java.com.nagarro.remotelearning.musicalinstruments.MusicalInstruments;

import java.util.ArrayList;
import java.util.List;

public class Musician {
    private String name;
    private int age;
    private int yearsOfExperience;

    private List<MusicalInstruments> listOfIntruments = new ArrayList<>();

    public Musician(String name, int age, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}

