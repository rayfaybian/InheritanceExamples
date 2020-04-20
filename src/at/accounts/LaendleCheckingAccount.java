package at.accounts;

public class LaendleCheckingAccount extends StandardAccount {
    private String accountOwner;
    private double interestRate;
    private double overdraftFrame;
    private double overdraftInterestRate;
    private double availableBalance;
    private CreditAccount credit;
    private boolean unpaidCredit;
    private double creditFrame;

    public LaendleCheckingAccount(String accountNumber, double accountBalance, TYPE accountType, String accountOwner,
                                  double interestRate, double overdraftFrame, double overdraftInterestRate,
                                  CreditAccount credit) {
        super(accountNumber, accountBalance, accountType);
        this.accountOwner = accountOwner;
        this.interestRate = interestRate;
        this.overdraftFrame = overdraftFrame;
        this.overdraftInterestRate = overdraftInterestRate;
        this.availableBalance = getAccountBalance() + getOverdraftFrame();
        this.credit = credit;
        this.creditFrame = credit.getAccountBalance();
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

    public double getCreditFrame() {
        return creditFrame;
    }


    @Override
    public double getOverdraftInterest() {
        return (getAccountBalance() * -1 * getOverdraftInterestRate()) / 1200;
    }

    public void payOverdraftInterest() {
        if (getAccountBalance() < 0) {
            double interest = (getAccountBalance() * -1 * getOverdraftInterestRate()) / 1200;
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
        System.out.println("\nCredit:");
        System.out.println("Frame: €" + String.format("%.2f", getCreditFrame()));
        System.out.println("Available Credit: €" + String.format("%.2f", credit.getAccountBalance()));
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
        if (unpaidCredit) {
            payOffCredit();
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

    public void payOffCredit() {
        double creditCost = (getCreditFrame() - credit.getAccountBalance()) + credit.getInterest();
        System.out.println("\nCredit Balance: €" +
                String.format("%.2f", -(getCreditFrame() - credit.getAccountBalance())) +
                "\nInterest: €" + String.format("%.2f", - credit.getInterest()));
        //System.out.println("\nPaying off €" + String.format("%.2f",creditCost));
        System.out.printf("\nPaying off €%.2f",creditCost);
        System.out.print("\nStatus: ");
        if (getAvailableBalance() >= creditCost) {
            setAccountBalance(getAccountBalance() - creditCost);
            credit.setAccountBalance(getCreditFrame());
            unpaidCredit = false;
            availableBalance = getAccountBalance() + overdraftFrame;

            if (availableBalance < 0) {
                availableBalance = 0;
            }
            System.out.print("PAID\n");

        } else {
            System.out.print("FAILED");
            System.out.println("\nAccount balance too low! Credit not paid!" +
                    "\nSystem will automatically try to pay the next time you deposit money.\n" +
                    "A €10 fee will be added to your credit cost.");
            credit.setAccountBalance(credit.getAccountBalance() - 10);
            unpaidCredit = true;
        }

    }

    @Override
    public double getInterest() {
        return (getAccountBalance() * getInterestRate()) / (100 * 360);
    }

    public void collectInterest(int days) {
        if (getAccountBalance() > 0) {
            double interest = (getAccountBalance() * getInterestRate() * days) / (100 * 360);
            double newBalance = getAccountBalance() + interest;
            setAccountBalance(newBalance);
            System.out.println("You collected €" + String.format("%.2f", interest) +
                    " in interest for the last " + days + " days.");
        }
    }

    public void useCreditAccount(double amount) {
        credit.payOut(amount);
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nAccount Owner: " + getAccountOwner() +
                "\nInterest Rate: " + getInterestRate() + "%p.A." +
                "\nOverdraft Frame: €" + String.format("%.2f", getOverdraftFrame()) +
                "\nBalance: €" + String.format("%.2f", getAccountBalance()) +
                "\nAvailable Balance: €" + String.format("%.2f", getAvailableBalance()) +
                "\n- Credit Frame: €" + String.format("%.2f", getCreditFrame()) +
                "\n- Credit Balance: " + String.format("%.2f", credit.getAccountBalance());
    }
}