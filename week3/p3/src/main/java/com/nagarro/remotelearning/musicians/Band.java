package main.java.com.nagarro.remotelearning.musicians;

import main.java.com.nagarro.remotelearning.Song;

import java.util.ArrayList;
import java.util.List;

public class Band {
    private String name;
    private int numberOfMembers;
    private List<Musician> listOfMembers = new ArrayList<>();
    private String bandType;

    public Band(String name, String bandType) {
        this.name = name;
        this.numberOfMembers = 0;
        this.bandType = bandType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String nameOfBand) {
        this.name = nameOfBand;
    }

    public int getNumberOfMembers() {
        return this.numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public String getBandType() {
        return this.bandType;
    }

    public void setBandType(String bandType) {
        this.bandType = bandType;
    }

    public void sing() {
        System.out.println("The band sings in a concert.");
    }

    public void practice() {
        System.out.println("The band practices the songs during weekly rehearsals.");
    }

    public Song createSong(String nameOfSong, int durationOfSong, String typeOfSong) {
        return new Song(nameOfSong, durationOfSong, typeOfSong);
    }

    public void addMember(Musician newMember) {
        this.listOfMembers.add(newMember);
        setNumberOfMembers(this.numberOfMembers + 1);
    }

    public void removeMember(Musician member) throws Exception {
        if (this.numberOfMembers == 0) {
            throw new Exception("The band should have at least one member before removing one.");
        }
        this.listOfMembers.remove(member);
        setNumberOfMembers(this.numberOfMembers - 1);
    }
}
