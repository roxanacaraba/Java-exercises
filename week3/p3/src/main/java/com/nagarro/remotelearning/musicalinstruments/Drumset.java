package main.java.com.nagarro.remotelearning.musicalinstruments;

public class Drumset extends MusicalInstruments  {
    private String typeOfDrums;

    public Drumset(String name, String typeOfInstrument, String typeOfDrums) {
        super(name, typeOfInstrument);
        this.typeOfDrums = typeOfDrums;
    }

    public String getTypeOfDrums() {
        return this.typeOfDrums;
    }

    public void setTypeOfDrums(String typeOfDrums) {
        this.typeOfDrums = typeOfDrums;
    }
}
