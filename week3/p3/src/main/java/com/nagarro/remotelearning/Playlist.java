package main.java.com.nagarro.remotelearning;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Song> listOfSongs = new ArrayList<>();
    private int numberOfSongs;

    public Playlist(String name, int numberOfSongs) {
        this.name = name;
        this.numberOfSongs = numberOfSongs;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String nameOfPlaylist) {
        this.name = nameOfPlaylist;
    }

    public List<Song> getListOfSongs() {
        return this.listOfSongs;
    }

    public void setListOfSongs(ArrayList<Song> listOfSongs) {
        this.listOfSongs = listOfSongs;
    }

    public int getNumberOfSongs() {
        return this.numberOfSongs;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public void addSong(Song newSong) {
        this.listOfSongs.add(newSong);
        setNumberOfSongs(this.listOfSongs.size());
    }

    public void deleteSong(Song deletedSong) {
        this.listOfSongs.remove(deletedSong);
        setNumberOfSongs(this.listOfSongs.size());
    }
}
