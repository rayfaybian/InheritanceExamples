package at.humans;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String city;
    List<OfficeWorker> employees = new ArrayList<>();

    public Company(String name, String city) {
        this.name = name;
        this.city = city;
        System.out.println(name + " has been founded in " + city + ".\n");
    }

    public void addEmployees(OfficeWorker worker) {
        employees.add(worker);
        System.out.println(worker.getName() + " started to work as a " + worker.getJob() + " at " + name +
                " in " + city + ".");
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void giveRaise(OfficeWorker worker, int amountOfRaise) {
        worker.setMonthlySalary(worker.getMonthlySalary() + amountOfRaise);
        System.out.println("\n" + worker.getName() + " got a raise.");
        System.out.println(worker.getName() + ": Thank's to " + getName() + " I'm now earning €" +
                amountOfRaise + " more every month.");
    }

    public void printCompanyDetails() {
        System.out.println("\nCompany Details\n\nName: " + getName() +
                "\nCity: " + getCity() +
                "\n\nEmployees: ");
        for (OfficeWorker employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public void releaseAProduct(String product){
        System.out.println("\nWe here at " + getName() + " believe in money. Your money. So buy our new product: "
        + product + "\nIt can do things. And other things. Maybe even more than that, I don't know... " +
                "just give us your money.");
    }


}
