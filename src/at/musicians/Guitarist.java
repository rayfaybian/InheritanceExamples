package at.musicians;

public class Guitarist extends Musician {
    public Guitarist(String name, int age) {
        super(name, age);
    }


    @Override
    public void play() {
        System.out.println("I'm " + getName() + " ,I'm " + getAge() + " years old and I hit the strings!");
    }
}
