package at.sufa4;

public class OfficeWorker extends Person {
    private String job;
    private int monthlySalary;

    public OfficeWorker(String firstName, String lastName, int age, String job, int monthlySalary) {
        super(firstName, lastName, age);
        this.job = job;
        this.monthlySalary = monthlySalary;


    }
    public String getName(){
        return getFirstName() + " " + getLastName();
    }


    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public String getJob() {
        return job;
    }

    public void work(){
        System.out.println(getName() + ": I'm going to work now");
    }

    public void takeABreak(){
        System.out.println(getName() + ": I'm taking a break now.");
    }

    @Override
    public String toString() {
        return  "\nName: " + getName() +
                "\nJob: " + job +
                "\nMonthly Salary: €" + monthlySalary;
    }
}
