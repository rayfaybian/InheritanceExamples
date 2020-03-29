package at.sufa;

import java.util.Random;

public class Stage {

    public static void main(String[] args) {

        Band myBand = new Band("ThunderBOOM", "Rock", "Highway To Hell",
                "Master Of Puppets","Hate To Say I Told You So",
                "Bohemian Rapsody ","Brianstorm");
        Singer singer = new Singer("Anton", 63, myBand);
        Bassplayer bassplayer = new Bassplayer("Herbert", 72, myBand);
        Drummer drummer = new Drummer("Peter", 89, myBand);
        Keyboardplayer keyboardplayer = new Keyboardplayer("Michael", 74, myBand);
        Leadguitarist leadguitarist = new Leadguitarist("Jeremy-Pascal", 12, myBand);

        makeMusic(myBand,singer,bassplayer,drummer,keyboardplayer,leadguitarist);


    }

    public static void makeMusic(Band myband, Musician... group) {
        myband.sayHello();
        for (Musician musician : group) {
            musician.playSong();


        }myband.startConcert();
    }
}