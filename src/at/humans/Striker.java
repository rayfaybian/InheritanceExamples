package at.humans;

public class Striker extends SoccerPlayer{
    private int goalsShot;
    private int shotsMissed;

    public Striker(String firstName, String lastName, int age, int fitnessLevel, int power, int tacticalSkill,
                   int playerNumber, String position, int goalsShot, int shotsMissed) {
        super(firstName, lastName, age, fitnessLevel, power, tacticalSkill, playerNumber, position);
        this.goalsShot = goalsShot;
        this.shotsMissed = shotsMissed;
    }

    public void shootGoal(){
        System.out.println(getName() + " shot a goal!!!");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a striker!");
    }

    public void reactToMiss(){
        System.out.println("FU**!!! I'm sorry I missed that.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nGoals shot: " + goalsShot +
                "\nShots missed: " + shotsMissed;

    }
}
