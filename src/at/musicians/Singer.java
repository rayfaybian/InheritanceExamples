package at.musicians;

public class Singer extends Musician {
    public Singer(String name, int age) {
        super(name, age);
    }


    @Override
    public void play() {
        System.out.println("I'm " + getName() + " ,I'm " + getAge() + " years old and I sing 'lalalala'");
    }
}
