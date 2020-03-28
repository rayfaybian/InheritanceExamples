package at.sufa;

import java.util.ArrayList;
import java.util.Random;

public class Band {
    private String name;
    private String genre;
    String[] songs;

    public Band(String name, String genre, String song1, String song2, String song3, String song4, String song5) {
        this.name = name;
        this.genre = genre;
        this.songs = new String[5];
        this.songs[0] = song1;
        this.songs[1] = song2;
        this.songs[2] = song3;
        this.songs[3] = song4;
        this.songs[4] = song5;
    }

    public void sayHello() {
        System.out.println("\nHello everybody, we are " + name + ". " +
                "\nWe play " + genre + " and here are the bandmembers:\n");
    }

    public void startConcert() {
        Random wurlitzer = new Random();
        int nextSong = wurlitzer.nextInt(5);
        System.out.println("\nThis next song is called " + songs[nextSong]);
    }
}
