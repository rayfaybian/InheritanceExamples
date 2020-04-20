package at.musicians;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Competition {
    public enum TYPE {SINGING, GUITARPLAYING, BASSPLAYING, DRUMMING, KEYBOARDBPLAYING}

    private String name;
    List<Musician> competitors = new ArrayList<>(3);


    public Competition(String name) {
        this.name = name;
    }

    public void addMusician(Musician competitor) {
        competitors.add(competitor);
    }

    public void performing(){
        for (int i = 0; i < 3 ; i++) {
            competitors.get(i).play();

        }
    }
    public void contest(TYPE type) {
        if (type.equals(TYPE.SINGING)) {
            System.out.println("\nWelcome to the singing competition " + name);
            System.out.println("All 3 contestants will sing a song and the computer will select " +
                    "a winner.");
            System.out.println("\nAnd here are the 3 contestants:");
            System.out.println(toString());
            performing();
            System.out.println("\nNow the big moment has come:");
        }
        if (type.equals(TYPE.GUITARPLAYING)) {
            System.out.println("\nWelcome to the guitar playing competition " + name);
            System.out.println("All 3 contestants will play a song on the guitar and the computer will select " +
                    "a winner.");
            System.out.println("\nAnd here are the 3 contestants:");
            System.out.println(toString());
            performing();
            System.out.println("\nNow the big moment has come:");

        }
        if (type.equals(TYPE.BASSPLAYING)) {
            System.out.println("\nWelcome to the bass playing competition " + name);
            System.out.println("All 3 contestants will play a song on the bass guitar and the computer will select " +
                    "a winner.");
            System.out.println("\nAnd here are the 3 contestants:");
            System.out.println(toString());
            performing();
            System.out.println("\nNow the big moment has come:");

        }
        if (type.equals(TYPE.DRUMMING)) {
            System.out.println("\nWelcome to the drumming competition " + name);
            System.out.println("All 3 contestants will play a song on the drums and the computer will select " +
                    "a winner.");
            System.out.println("\nAnd here are the 3 contestants:");
            System.out.println(toString());
            performing();
            System.out.println("\nNow the big moment has come:");

        }
        if (type.equals(TYPE.KEYBOARDBPLAYING)) {
            System.out.println("\nWelcome to the keyboard playing competition " + name);
            System.out.println("All 3 contestants will play a song on the keyboard and the computer will select " +
                    "a winner.");
            System.out.println("\nAnd here are the 3 contestants:");
            System.out.println(toString());
            performing();
            System.out.println("\nNow the big moment has come:");

        }

        Random random = new Random();
        int winner = random.nextInt(3);
        System.out.println("The winner of " + name + " is...." + competitors.get(winner).getName() +
                "! Congratulations!");
    }


    @Override
    public String toString() {
        return "\n - Contestant 1: " + competitors.get(0).getName() + "(" + competitors.get(0).getAge() + ")" +
                "\n - Contestant 2: " + competitors.get(1).getName() + "(" + competitors.get(1).getAge() + ")" +
                "\n - Contestant 3: " + competitors.get(2).getName() + "(" + competitors.get(2).getAge() + ")\n";
    }
}
