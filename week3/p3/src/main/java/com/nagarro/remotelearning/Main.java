package main.java.com.nagarro.remotelearning;

import main.java.com.nagarro.remotelearning.musicians.Band;
import main.java.com.nagarro.remotelearning.musicians.LeadGuitarist;
import main.java.com.nagarro.remotelearning.musicians.Musician;

public class Main {
    public static void main(String[] args) {

        Band myBand = new Band("Marley","Jazz");
        Song firstJazzSong = myBand.createSong("Lovely Morning", 3, "Jazz");
        Playlist jazzPlaylist = new Playlist("Jazz Music", 0);
        jazzPlaylist.addSong(firstJazzSong);
        System.out.println("The number of songs after adding the first song: " + jazzPlaylist.getNumberOfSongs());
        Song secondJazzSong = myBand.createSong("Ocean", 4, "Jazz");
        jazzPlaylist.addSong(secondJazzSong);
        System.out.println("The number of songs after adding the second song: " + jazzPlaylist.getNumberOfSongs());
        jazzPlaylist.deleteSong(firstJazzSong);
        System.out.println("The number of songs after deleting the first song: " + jazzPlaylist.getNumberOfSongs());
        Musician guitarist = new LeadGuitarist("Michel", 34, 5);
        System.out.println(guitarist.getAge());
        System.out.println(myBand.getNumberOfMembers());
        myBand.addMember(guitarist);
        System.out.println(myBand.getNumberOfMembers());
        try {
            myBand.removeMember(guitarist);
        }
        catch (Exception e) {
           System.out.println("Error when removing a member.");
        }
        System.out.println(myBand.getNumberOfMembers());


    }
}
