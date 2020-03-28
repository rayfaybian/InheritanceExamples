package at.sufa;

import org.w3c.dom.ls.LSOutput;

public class Keyboardplayer extends Musician {
    public Keyboardplayer(String name, int age, Band band) {
        super(name, age, band);
    }

    @Override
    public void playSong() {
        System.out.println("I am " + getName() + " ,I´m " + getAge() + " years old and I play the keyboard!");
    }
}
