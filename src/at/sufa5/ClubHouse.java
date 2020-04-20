package at.sufa5;

public class ClubHouse {

    public static void main(String[] args) {

        Club myClub = new Club("Donald Trump Fanclub", 798725);

        ClubMember chairman = new ClubMember("Donald", "Trump",73,1946,
                MembershipStatus.CHAIRMAN);
        ClubMember viceChairman = new ClubMember("Martin","Alge",60,2008,
                MembershipStatus.VICECHAIRMAN);
        ClubMember treasurer = new ClubMember("Stefan","Hämmerle",43,2015,
                MembershipStatus.TREASURER);
        ClubMember viceTreasurer = new ClubMember("Doris", "Längle",38,2006,
                MembershipStatus.VICETREASURER);
        ClubMember secretary = new ClubMember("Edit","Ender",32,2008,
                MembershipStatus.SECRETARY);
        ClubMember member1 = new ClubMember("Richard","Huber",42,2019,
                MembershipStatus.STANDARD);
        ClubMember member2 = new ClubMember("Benjamin", "Benjaminsen",36,2017,
                MembershipStatus.STANDARD);
        ClubMember member3 = new ClubMember("Miriam", "Müller", 26,2018,
                MembershipStatus.STANDARD);


        myClub.addClubMembers(chairman);
        myClub.addClubMembers(viceChairman);
        myClub.addClubMembers(treasurer);
        myClub.addClubMembers(viceTreasurer);
        myClub.addClubMembers(secretary);
        myClub.addClubMembers(member1);
        myClub.addClubMembers(member2);
        myClub.addClubMembers(member3);



        System.out.println();

        myClub.collectMembershipFee();

        myClub.printClubDetails();
    }
}
