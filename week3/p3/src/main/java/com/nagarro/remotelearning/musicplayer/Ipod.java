package main.java.com.nagarro.remotelearning.musicplayer;

import main.java.com.nagarro.remotelearning.Song;

public class Ipod extends MusicPlayer {

    public Ipod() {}

    public void playVideos(Song song) {
        System.out.println("Play the video for the song: " + song.getName());
    }

}
