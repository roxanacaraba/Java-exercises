package main.java.com.nagarro.remotelearning;

public class Song {
    private String name;
    private int duration;
    private String songType;

    public Song(String name, int duration, String  songType) {
        this.name = name;
        this.duration = duration;
        this.songType = songType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String nameOfSong) {
        this.name = nameOfSong;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getSongType() {
        return this.songType;
    }

    public void setSongType(String songType) {
        this.songType = songType;
    }
}
