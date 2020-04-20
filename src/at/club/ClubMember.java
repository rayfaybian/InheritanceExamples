package at.club;

public class ClubMember extends Person {
    private int entryYear;
    private double feePercentage;
    private MembershipStatus status;


    public ClubMember(String firstName, String lastName, int age, int entryYear,
                      MembershipStatus status) {
        super(firstName, lastName, age);
        this.entryYear = entryYear;
        this.status = status;
        if (status.equals(MembershipStatus.STANDARD)) {
            this.feePercentage = 100;
        }
        if (status.equals(MembershipStatus.CHAIRMAN)) {
            this.feePercentage = 50;
        }
        if (status.equals(MembershipStatus.VICECHAIRMAN)) {
            this.feePercentage = 60;
        }
        if(status.equals(MembershipStatus.TREASURER)){
            this.feePercentage = 70;
        }
        if (status.equals(MembershipStatus.VICETREASURER)){
            this.feePercentage = 80;
        }
        if (status.equals(MembershipStatus.SECRETARY)){
            this.feePercentage = 90;
        }
    }

    public double payMembershipFee(double fee) {
       return fee * (getFeePercentage() / 100);

    }

    public int getEntryYear() {
        return entryYear;
    }

    public double getFeePercentage() {
        return feePercentage;
    }

    public String getStatus() {
        return status.getName();
    }

    @Override
    public String toString() {
        return "\n" + getStatus() +
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nEntry Year: " + getEntryYear() +
                "\nFee percentage: " + String.format("%.0f",getFeePercentage()) + "%\n";
    }
}
