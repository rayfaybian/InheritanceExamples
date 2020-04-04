package at.sufa3;

public class Bank {

    public static void main(String[] args){
        /*Welcome to the Bank

        There are 5 Accounts

        - Standard account: Anonymous number account without interest or overdraft frame
        - Savings book: Anonymous Savings book with annual interest rate
        - Checking Account: Personal account with overdraft frame and annual interest rate
        - Laendle Checking Account (LCA): Checking account with additional credit account
        - Credit account: Credit account with low interest rate (only in combination with Laendle Checking Account)*/


        StandardAccount myDrugMoney = new StandardAccount("AT5000274992",522,
                StandardAccount.TYPE.STANDARDACCOUNT);

        myDrugMoney.payIn(200);
        myDrugMoney.showBalance();
        myDrugMoney.payOut(1000);
        myDrugMoney.payOut(421.85);
        System.out.println(myDrugMoney.toString());

        System.out.println("----------------------------");

        SavingsBook mySavingsBook = new SavingsBook("AT5000274993",4297,
                StandardAccount.TYPE.SAVINGSBOOK,1.25);
        mySavingsBook.payIn(597);
        mySavingsBook.showBalance();
        mySavingsBook.collectInterest(296);
        mySavingsBook.showBalance();
        mySavingsBook.payOut(4296);
        System.out.println(mySavingsBook.toString());

        System.out.println("----------------------------");

        CheckingAccount myCheckingAccount = new CheckingAccount("AT5000274994",2500,
                StandardAccount.TYPE.CHECKINGACCOUNT,
                "Peter Müller",0.75,500,17.40);

        myCheckingAccount.payIn(0);
        myCheckingAccount.showBalance();
        myCheckingAccount.payOut(5000);
        myCheckingAccount.payOut(500);
        myCheckingAccount.showBalance();
        myCheckingAccount.payOverdraftInterest();
        myCheckingAccount.payOut(2500);
        myCheckingAccount.payOverdraftInterest();
        myCheckingAccount.showBalance();
        myCheckingAccount.payIn(6843);
        myCheckingAccount.showBalance();
        myCheckingAccount.collectInterest(122);
        System.out.println(myCheckingAccount.toString());

        System.out.println("----------------------------");

        CreditAccount myCreditAccount = new CreditAccount("CR2248794615",900,
                StandardAccount.TYPE.CREDITACCOUNT,4.75);
        LaendleCheckingAccount myLCA = new LaendleCheckingAccount("AT5000274995",
                2600, StandardAccount.TYPE.LAENDLECHECKINGACCOUNT,"Hubert Müller",
                0.98,700,17.40,myCreditAccount);

        myLCA.showBalance();
        myLCA.useCreditAccount(860);
        myLCA.payOut(3000);
        myLCA.showBalance();
        myLCA.payOverdraftInterest();
        myLCA.payOffCredit();
        myLCA.payIn(4000);
        myLCA.showBalance();
        myLCA.collectInterest(972);
        System.out.println(myLCA.toString());
    }
}
