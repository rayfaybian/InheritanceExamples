package at.sufa5;

public enum MembershipStatus {
    STANDARD ("Standard Member"),
    CHAIRMAN("Chairman"),
    VICECHAIRMAN("Vice Chairman"),
    TREASURER("Treasurer"),
    VICETREASURER("Vice Treasurer"),
    SECRETARY("Secretary");

    private String name;

    MembershipStatus(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
}
