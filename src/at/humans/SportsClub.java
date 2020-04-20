package at.humans;

import java.util.ArrayList;
import java.util.List;

public class SportsClub {
    private String name;
    private String city;
    List<SoccerPlayer> players = new ArrayList<>();

    public SportsClub(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void buildTeam(SoccerPlayer player){
        players.add(player);
    }

    public void showTeam(){
        System.out.println("\nWe are " + getName() +" " + getCity() + " and this is the Team:\n");
        for (SoccerPlayer player : players) {
            System.out.println("#" + player.getPlayerNumber() + " " + player.getFullName() + ", "
                    + player.getAge() + ", " + player.getPostition());
        }
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void promoteAPlayer(SoccerPlayer player){
        System.out.println("\n" + getName() + " " + getCity() + " proudly presents, our player of the month:\n"
                + player.toString());
    }
}
