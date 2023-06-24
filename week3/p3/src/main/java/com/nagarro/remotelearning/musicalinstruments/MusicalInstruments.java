package main.java.com.nagarro.remotelearning.musicalinstruments;

public class MusicalInstruments {

    private String name;
    private String typeOfInstrument;

    public MusicalInstruments(String name, String typeOfInstrument) {
        this.name = name;
        this.typeOfInstrument = typeOfInstrument;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfInstrument() {
        return this.typeOfInstrument;
    }

    public void setTypeOfInstrument(String typeOfInstrument) {
        this.typeOfInstrument = typeOfInstrument;
    }
}
