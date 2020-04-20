package at.sufa5;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private String name;
    private double membershipFee;
    List<ClubMember> clubMembers = new ArrayList<>();

    public Club(String name, double membershipFee) {
        this.name = name;
        this.membershipFee = membershipFee;
        System.out.println(getName() + " has been created!\n");
    }

    public void addClubMembers(ClubMember newMember){
        clubMembers.add(newMember);
        System.out.println(newMember.getName() + " has joined " + getName() + " as " + newMember.getStatus() + "!");

    }
    public void collectMembershipFee(){
        double totalFeeCollected = 0.00;
        for (ClubMember clubMember : clubMembers) {
            System.out.println(clubMember.getName() + " paid his membership fee of €"
                    + String.format("%.2f", clubMember.payMembershipFee(membershipFee)));
            totalFeeCollected = totalFeeCollected + clubMember.payMembershipFee(membershipFee);
        }
        System.out.println("\nTotal amount of membership fees collected: €" + String.format("%.2f",totalFeeCollected));
    }

    public String getName() {
        return name;
    }

    public double getMembershipFee() {
        return membershipFee;
    }

    public void printClubDetails() {
        System.out.println("\n::::::::::Clubdetails:::::::::::\n\nClubname: " + getName() +
                "\nMembership fee per year: €" + String.format("%.2f",getMembershipFee()) +
                "\n\n::::::::::Members::::::::::");
        for (ClubMember member : clubMembers) {
            System.out.println(member.toString());

        }
    }
}
