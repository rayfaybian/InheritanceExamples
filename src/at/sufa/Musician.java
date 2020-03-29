package at.sufa;

public class Musician {
    private String name;
    private int age;
    private Band band;


    public Musician(String name, int age, Band band){
        this.name = name;
        this.age = age;
        this.band = band;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public  void playSong(){
        System.out.println("I´m playing a song");
    }
}
