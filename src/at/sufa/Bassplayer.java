package at.sufa;

public class Bassplayer extends Musician {
    public Bassplayer(String name, int age) {
        super(name, age);
    }


    @Override
    public void play() {
        System.out.println("I'm " + getName() + " ,I'm " + getAge() + " years old and I slap the bass strings!");
    }
}
