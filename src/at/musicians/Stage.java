package at.musicians;

public class Stage {

    public static void main(String[] args) {
        /*Es gibt Musiker. Musiker könnnen Sänger, Gitarristen oder Bassisten sein.
        Jede Band hat mehrer Musiker (Achtung 1 zu n Beziehung)
        Jede Band spielt mehrere songs (wieder 1 zu n)
        Eine Competition hat mehrere teilnehmende Musiker
        und EINEN Sieger*/

        //Songs
        Song song1 = new Song("Highway To Hell");
        Song song2 = new Song("Master Of Puppets");
        Song song3 = new Song("House Of The Rising Song");
        Song song4 = new Song("Yellow Submarine");
        Song song5 = new Song("Bad Guy");
        Song song6 = new Song("Rock Me Amadeus");
        Song song7 = new Song("Pretty Fly(For A White Guy)");
        Song song8 = new Song("Take On Me");
        Song song9 = new Song("Clocks");

        //Singers
        Singer singer1 = new Singer("Andreas",30);
        Singer singer2 = new Singer("Peter",50);
        Singer singer3 = new Singer("Martina",40);

        //Guitarists
        Guitarist guitarist1 = new Guitarist("Alexandra",27);
        Guitarist guitarist2 = new Guitarist("Erik",47);
        Guitarist guitarist3 = new Guitarist("Gregor",37);

        //Bassplayers
        Bassplayer bassplayer1 = new Bassplayer("Bettina",22);
        Bassplayer bassplayer2 = new Bassplayer("Christian",42);
        Bassplayer bassplayer3 = new Bassplayer("Alina",32);

        //Drummers
        Drummer drummer1 = new Drummer("Klaudia",24);
        Drummer drummer2 = new Drummer("Dirk", 44);
        Drummer drummer3 = new Drummer("Nico",34);

        //Keyboardplayers
        Keyboardplayer keyboardplayer1 = new Keyboardplayer("Aaron",26);
        Keyboardplayer keyboardplayer2 = new Keyboardplayer("Oliver",46);
        Keyboardplayer keyboardplayer3 = new Keyboardplayer("Tina",36);

        //Bands
        Band band1 = new Band("Metallica 2.0",song1,song2,song3,singer1,guitarist1,bassplayer1,drummer1,
                keyboardplayer1);
        Band band2 = new Band("The Beatles 2.0",song4,song5,song6,singer2,guitarist2,bassplayer2,drummer2,
                keyboardplayer2);
        Band band3 = new Band("AC/DC 2.0", song7,song8,song9,singer3,guitarist3,bassplayer3,drummer3,
                keyboardplayer3);

        //Band Details
        System.out.println(band1.toString());
        System.out.println(band2.toString());
        System.out.println(band3.toString());

        //Bands in concert
        band1.playRepertoire();
        band2.playRepertoire();
        band3.playRepertoire();

        //Competitions
        Competition singing = new Competition("'Best Voice Of 2020'");
        singing.addMusician(singer1);
        singing.addMusician(singer2);
        singing.addMusician(singer3);
        singing.contest(Competition.TYPE.SINGING);

        Competition guitarPlaying = new Competition("'Best Guitarist Of 2020'");
        guitarPlaying.addMusician(guitarist1);
        guitarPlaying.addMusician(guitarist2);
        guitarPlaying.addMusician(guitarist3);
        guitarPlaying.contest(Competition.TYPE.GUITARPLAYING);

        Competition bassPlaying = new Competition("'Best Bass Player Of 2020'");
        bassPlaying.addMusician(bassplayer1);
        bassPlaying.addMusician(bassplayer2);
        bassPlaying.addMusician(bassplayer3);
        bassPlaying.contest(Competition.TYPE.BASSPLAYING);

        Competition drumming = new Competition("'Best Drummer Of 2020");
        drumming.addMusician(drummer1);
        drumming.addMusician(drummer2);
        drumming.addMusician(drummer3);
        drumming.contest(Competition.TYPE.DRUMMING);

        Competition keyboardPlaying = new Competition("'Best Keyboard Player Of 2020'");
        keyboardPlaying.addMusician(keyboardplayer1);
        keyboardPlaying.addMusician(keyboardplayer2);
        keyboardPlaying.addMusician(keyboardplayer3);
        keyboardPlaying.contest(Competition.TYPE.KEYBOARDBPLAYING);

    }
}