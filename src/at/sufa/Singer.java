package at.sufa;

public class Singer extends Musician {
    public Singer(String name, int age, Band band) {
        super(name, age, band);
    }



    @Override
    public void playSong() {
        System.out.println("I am " + getName() + " ,I´m " + getAge() + " years old and I sing the lyrics!");
    }
}
