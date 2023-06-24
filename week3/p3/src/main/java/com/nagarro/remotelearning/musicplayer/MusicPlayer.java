package main.java.com.nagarro.remotelearning.musicplayer;

import main.java.com.nagarro.remotelearning.Playlist;
import main.java.com.nagarro.remotelearning.Song;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private int width;
    private int length;
    private String shape;
    private List<Playlist> listOfPlaylists;

    public MusicPlayer() {
    }

    public MusicPlayer(int width, int length, String shape) {
        this.width = width;
        this.length = length;
        this.shape = shape;
    }

    public int getWidth() {
        return this.width;
    }

    public void setName(int width) {
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getShape() {
        return this.shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public List<Playlist> getListOfPlaylists() {
        return this.listOfPlaylists;
    }

    public void setListOfPlaylists(List<Playlist> listOfPlaylists) {
        this.listOfPlaylists = listOfPlaylists;
    }

    public void playSong(Song song) {
        System.out.println("Play the song " + song.getName());
    }
}
