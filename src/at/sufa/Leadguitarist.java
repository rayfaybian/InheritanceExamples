package at.sufa;

public class Leadguitarist extends Musician {
    public Leadguitarist(String name, int age, Band band) {
        super(name, age, band);
    }

    @Override
    public void playSong() {
        System.out.println("I am " + getName() + " ,I´m " + getAge() + " years old and I play the leadguitar!");
    }
}
