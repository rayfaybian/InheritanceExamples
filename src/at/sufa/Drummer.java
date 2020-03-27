package at.sufa;

public class Drummer extends Musician {
    public Drummer(String name, int age, Band band) {
        super(name, age, band);
    }

    @Override
    public void playSong() {
        System.out.println("I am " + getName() +" and I play the drums!");
    }
}
