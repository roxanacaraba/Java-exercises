package main.java.com.nagarro.remotelearning.musicplayer;

public class CDPlayer extends MusicPlayer {
    private String supportedCDType;

    public CDPlayer(String supportedCDType) {
        this.supportedCDType = supportedCDType;
    }

    public String getSupportedCDType() {
        return supportedCDType;
    }

    public void setSupportedCDType(String supportedCDType) {
        this.supportedCDType = supportedCDType;
    }

    public void insertCD() {
        System.out.println("Please insert a CD.");
    }

    public void removeCD() {
        System.out.println("Please remove the CD.");
    }
}
