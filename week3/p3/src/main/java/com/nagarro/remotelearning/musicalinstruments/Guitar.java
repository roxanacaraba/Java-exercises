package main.java.com.nagarro.remotelearning.musicalinstruments;

public class Guitar extends MusicalInstruments  {

    private String typeOfGuitar;

    public Guitar(String name, String typeOfInstrument, String typeOfGuitar) {
        super(name, typeOfInstrument);
        this.typeOfGuitar = typeOfGuitar;
    }

    public String getTypeOfGuitar() {
        return this.typeOfGuitar;
    }

    public void setTypeOfGuitar(String typeOfGuitar) {
        this.typeOfGuitar = typeOfGuitar;
    }
}
