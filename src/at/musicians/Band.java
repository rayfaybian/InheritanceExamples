package at.musicians;

import java.util.ArrayList;
import java.util.List;

public class Band {
    private String name;
    List<Song> songList = new ArrayList<>();
    List<Musician> bandMembers = new ArrayList<>();


    public Band(String name, Song song1, Song song2, Song song3, Musician singer, Musician guitar, Musician bass,
                Musician drums, Musician keyboard) {
        this.name = name;
        songList.add(song1);
        songList.add(song2);
        songList.add(song3);

        bandMembers.add(singer);
        bandMembers.add(guitar);
        bandMembers.add(bass);
        bandMembers.add(drums);
        bandMembers.add(keyboard);
    }

    public void sayHello() {
        System.out.println("\nHello everybody, we are " + name + " and here are the bandmembers:\n");
    }

    public void playRepertoire() {
        System.out.println(name + " is playing a concert.\n" +
                "\nSong 1: " + songList.get(0).getName() +
                "\nSong 2: " + songList.get(1).getName() +
                "\nSong 3: " + songList.get(2).getName() + " \n");

    }

    @Override
    public String toString() {
        return "\nBand: " +name +
                "\nBandmembers:" +
                "\n - Singer: " + bandMembers.get(0).getName() + "(" + bandMembers.get(0).getAge() + ")" +
                "\n - Guitarist: " + bandMembers.get(1).getName() + "(" + bandMembers.get(1).getAge() + ")" +
                "\n - Bassplayer: " + bandMembers.get(2).getName() + "(" + bandMembers.get(2).getAge() + ")" +
                "\n - Drummer: " + bandMembers.get(3).getName() + "(" + bandMembers.get(3).getAge() + ")" +
                "\n - Keyboardplayer: " + bandMembers.get(4).getName() + "(" + bandMembers.get(4).getAge() + ")" +
                "\nRepertoire:" +
                "\n - Song 1: " + songList.get(0).getName() +
                "\n - Song 2: " + songList.get(1).getName() +
                "\n - Song 3: " + songList.get(2).getName()+"\n";
    }
}
