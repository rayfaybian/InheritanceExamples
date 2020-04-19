package at.sufa4;

public class SoccerPlayer extends Athlete {
    private int power;
    private int tacticalSkill;
    private int playerNumber;
    private String postition;

    public SoccerPlayer(String firstName, String lastName, int age, int fitnessLevel, int power, int tacticalSkill,
                        int playerNumber, String position) {
        super(firstName, lastName, age, fitnessLevel);
        this.power = power;
        this.tacticalSkill = tacticalSkill;
        this.playerNumber = playerNumber;
        this.postition = position;
    }

    public void thankTheCoach() {
        System.out.println(getName() + ": Thank you coach for letting me join the team!");
    }

    public void waveToCrowd() {
        System.out.println(getName() + ": Thank's for coming to the game everybody!");
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public String getPostition(){
        return postition;
    }


    public String getName() {
        return getFirstName() + " " + getLastName();
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a soccer player!");
    }

    @Override
    public String toString() {
        return  "\nName: " + getName() +
                "\nPlayer Number: " + playerNumber +
                "\nPosition: " + postition;
    }
}