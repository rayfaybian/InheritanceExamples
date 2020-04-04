package at.sufa3;

public class CheckingAccount extends StandardAccount {
    private String accountOwner;
    private double interestRate;
    private double overdraftFrame;
    private double overdraftInterestRate;
    private double availableBalance;

    public CheckingAccount(String accountNumber, double accountBalance, TYPE accountType, String accountOwner,
                           double interestRate, double overdraftFrame, double overdraftInterestRate) {
        super(accountNumber, accountBalance, accountType);
        this.accountOwner = accountOwner;
        this.interestRate = interestRate;
        this.overdraftFrame = overdraftFrame;
        this.overdraftInterestRate = overdraftInterestRate;
        this.availableBalance = getAccountBalance() + getOverdraftFrame();
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getOverdraftFrame() {
        return overdraftFrame;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public double getOverdraftInterestRate() {
        return overdraftInterestRate;
    }

    @Override
    public double getOverdraftInterest() {
        return (getAccountBalance() * -1 * getOverdraftInterestRate()) / 1200;
    }

    public void payOverdraftInterest() {
        if (getAccountBalance() < 0) {
            double interest = getOverdraftInterest();
            double newBalance = getAccountBalance() - interest;
            setAccountBalance(newBalance);
            availableBalance = getAccountBalance() + getOverdraftFrame();
            if (availableBalance < 0) {
                availableBalance = 0;
            }
            System.out.println("\nWARNING! NEGATIVE ACCOUNT BALANCE!\nYou paid €" +
                    String.format("%.2f", interest) + " in overdraft interest for the last month.");
        }
    }

    @Override
    public void showBalance() {
        super.showBalance();
        System.out.println("Available Balance: €" + String.format("%.2f", getAvailableBalance()));
    }

    @Override
    public void newAccountMessage() {
        System.out.println("\nNew Checking account opened. Your account balance is € " +
                String.format("%.2f", getAccountBalance()));
    }

    @Override
    public void payIn(double amount) {
        super.payIn(amount);
        if (getAccountBalance() < (overdraftFrame * -1)) {
            availableBalance = 0;
        } else {
            availableBalance = getAccountBalance() + overdraftFrame;
        }
    }

    @Override
    public void payOut(double amount) {
        System.out.println("\nWithdrawing €" + String.format("%.2f", amount));
        if (amount > getAvailableBalance()) {
            System.out.println("\nNot possible!\nLimit: €" + String.format("%.2f", getAccountBalance()));
        } else {
            System.out.println("\n€" + String.format("%.2f", amount) + " successfully paid out.");
            setAccountBalance(getAccountBalance() - amount);
            availableBalance = getAccountBalance() + overdraftFrame;

        }
    }

    @Override
    public double getInterest() {
        return (getAccountBalance() * getInterestRate()) / (100 * 360);
    }

    public void collectInterest(int days) {
        if (getAccountBalance() > 0) {
            double interest = getInterest() * days;
            double newBalance = getAccountBalance() + interest;
            setAccountBalance(newBalance);
            System.out.println("You collected €" + String.format("%.2f", interest) +
                    " in interest for the last " + days + " days.");
        }
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nAccount Owner: " + getAccountOwner() +
                "\nInterest Rate: " + getInterestRate() + " %p.A." +
                "\nOverdraft Frame: €" + String.format("%.2f", getOverdraftFrame()) +
                "\nBalance: €" + String.format("%.2f", getAccountBalance()) +
                "\nAvailable Balance: €" + String.format("%.2f", getAvailableBalance());
    }
}
