package at.sufa3;

public class StandardAccount {
    public enum TYPE {STANDARDACCOUNT,SAVINGSBOOK,CHECKINGACCOUNT,LAENDLECHECKINGACCOUNT,CREDITACCOUNT}
   private String accountNumber;
    private double accountBalance;
    private TYPE accountType;


    public StandardAccount(String accountNumber, double accountBalance, TYPE accountType) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
        newAccountMessage();

    }


    public void newAccountMessage(){
        System.out.println("\nNew account opened. Your account balance is € "
                + String.format("%.2f",getAccountBalance()));

    }
    public void setAccountBalance(double balance){
        this.accountBalance = balance;
    }

    public TYPE getAccountType() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public void showBalance() {
        System.out.println("\nAccount Balance: € " + String.format("%.2f",getAccountBalance()));
    }

    public void payIn(double amount) {
        this.accountBalance = accountBalance + amount;
        System.out.println("\n€" + String.format("%.2f",amount) + " paid into your account.");
    }

    public void payOut(double amount) {
        System.out.println("\nWithdrawing €" + String.format("%.2f", amount));
        if (amount > accountBalance) {
            System.out.println("\nNot possible!\nLimit: €" + String.format("%.2f", getAccountBalance()));
        } else {
            System.out.println("\n€" + String.format("%.2f", amount) + " successfully paid out.");
            this.accountBalance = accountBalance - amount;
        }
    }
    public double getInterest(){
        double interest = 0;
        return interest;
    }
    public double getOverdraftInterest(){
        double overDraftInterest = 0;
        return overDraftInterest;
    }

    @Override
    public String toString() {
        String balance = "";
        if (accountType.equals(TYPE.STANDARDACCOUNT)){
        balance = "\nBalance: €" + String.format("%.2f", getAccountBalance());}
        return  "\nAccount Details" +
                "\nType: " + getAccountType() +
                "\nAccount Number " + accountNumber +
                balance;

    }
}
