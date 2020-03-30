package at.sufa3;

public class Account {
    private String accountOwner;
    private double accountBalance;
    private double interestRate;
    private double overdraftFrame;
    private double overdraftInterestRate;
    private double availableAmount;

    public Account(String accountOwner, double interestRate, double overdraftFrame, double overdraftInterestRate){
        this.accountOwner = accountOwner;
        this.interestRate = interestRate;
        this.overdraftFrame = overdraftFrame;
        this.overdraftInterestRate = overdraftInterestRate;
        this.accountBalance = 0.00;
        this.availableAmount = accountBalance + overdraftFrame;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getOverdraftFrame() {
        return overdraftFrame;
    }

    public double getOverdraftInterestRate() {
        return overdraftInterestRate;
    }

    public double getAvailableAmount(){
        return availableAmount;

    }
    public void showBalance(){
        System.out.println("Account Balance: € " + getAccountBalance() + "\nAmout available: € " + availableAmount);
    }
    public void payIn(double amount){
        this.accountBalance = accountBalance + amount;
        this.availableAmount = availableAmount + amount;
    }
}
