package at.musicians;

public class Musician {
    private String name;
    private int age;


    public Musician(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void play() {
        System.out.println("I´m playing a song");
    }
}
