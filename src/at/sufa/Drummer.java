package at.sufa;

public class Drummer extends Musician {
    public Drummer(String name, int age) {
        super(name, age);
    }


    @Override
    public void play() {
        System.out.println("I'm " + getName() + " ,I'm " + getAge() + " years old and I hit the drums!");
    }
}
