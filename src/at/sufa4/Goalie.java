package at.sufa4;

public class Goalie extends SoccerPlayer {
    private int shotsKept;
    private int shotsNotKept;

    public Goalie(String firstName, String lastName, int age, int fitnessLevel, int power, int tacticalSkill,
                  int playerNumber, String position, int shotsKept, int shotsNotKept) {
        super(firstName, lastName, age, fitnessLevel, power, tacticalSkill, playerNumber, position);
        this.shotsKept = shotsKept;
        this.shotsNotKept = shotsNotKept;
    }



    public void catchShot(){
        System.out.println(getName() + "caught a shot!");
    }

    public void reactToGoal(){
        System.out.println("FU**!!! I'm sorry I didn't catch the ball.");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a Goalie!");
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nShots kept: " + shotsKept +
                "\nShots not kept: " + shotsNotKept;
    }
}

