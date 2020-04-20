package at.humans;

public class Athlete extends Person {
    private int fitnessLevel;
    private int trainingHours;

    public Athlete(String firstName, String lastName, int age, int fitnessLevel) {
        super(firstName, lastName, age);
        this.fitnessLevel = fitnessLevel;
        this.trainingHours = 0;
    }

    public int getFitnessLevel() {
        return fitnessLevel;
    }

    public int getTrainingHours() {
        return trainingHours;
    }

    public void doCardio(int time) {
        System.out.println("\nI'm starting cardio training for " + time + " hours.");
        trainingHours = getTrainingHours() + time;
        if (getFitnessLevel() > 100) {
            fitnessLevel = getFitnessLevel() + 1;
        }
    }

    public void liftWeights(int time) {
        System.out.println("\nI'm starting weight training for " + time + " hours.");
        trainingHours = getTrainingHours() + time;
        if (getFitnessLevel() > 100) {
            fitnessLevel = getFitnessLevel() + 1;

        }
    }

        @Override
    public void sayHello() {
        System.out.println("\nHello, I'm an athlete!");
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        System.out.println("My current fitnesslevel is " + getFitnessLevel() + "% and I've been training for "
                + getTrainingHours() + " hours so far.");
    }
}
