package at.accounts;

public class CreditAccount extends StandardAccount {
    private double interestRate;
    public double frame;

    public CreditAccount(String accountNumber, double accountBalance, TYPE accountType, double interestRate) {
        super(accountNumber, accountBalance, accountType);
        this.interestRate = interestRate;
        this.frame = accountBalance;
    }

    @Override
    public double getInterest() {
        return ((getFrame() - getAccountBalance()) * interestRate) / 1200;
    }

    public double getFrame() {
        return frame;
    }

    @Override
    public void payOut(double amount) {
        System.out.println("\nWithdrawing €" + String.format("%.2f", amount));
        if (amount > getAccountBalance()) {
            System.out.println("\nNot possible!\nLimit: €" + String.format("%.2f", getAccountBalance()));
        } else {
            System.out.println("\n€" + String.format("%.2f", amount) + " successfully paid out.");
            setAccountBalance(getAccountBalance() - amount);
        }
    }


}

