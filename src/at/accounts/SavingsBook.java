package at.accounts;

public class SavingsBook extends StandardAccount {
    private double interestRate;


    public SavingsBook(String accountNumber, double accountBalance, TYPE accountType, double interestRate) {
        super(accountNumber, accountBalance, accountType);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public double getInterest() {
        return (getAccountBalance() * getInterestRate()) / (100 * 360);
    }

    public void collectInterest(int days) {
        double interest = getInterest() * days;
        double newBalance = getAccountBalance() + interest;
        setAccountBalance(newBalance);
        System.out.println("You collected €" + String.format("%.2f", interest) +
                " in interest for the last " + days + " days.");
    }

    @Override
    public void newAccountMessage() {
        System.out.println("\nNew Savings Book opened. Your account balance is € " +
                String.format("%.2f", getAccountBalance()));
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nInterest Rate: " + String.format("%.2f", getInterestRate()) + " %p.A." +
                "\nBalance: €" + String.format("%.2f", getAccountBalance());
    }
}
