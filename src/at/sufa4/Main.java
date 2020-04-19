package at.sufa4;

public class Main {
    public static void main(String[] args) {



        Person firstHuman = new Person("Herbert", "Amann", 48);
        firstHuman.sayHello();
        firstHuman.introduceYourself();

        System.out.println("----------------------------");

        Athlete firstAthlete = new Athlete("Anna", "Müller", 27, 82);
        firstAthlete.sayHello();
        firstAthlete.doCardio(4);
        firstAthlete.liftWeights(3);
        firstAthlete.introduceYourself();

        System.out.println("----------------------------");

        SoccerPlayer randomPlayer = new SoccerPlayer("Benjamin", "Dreier", 22, 96, 76,
                81, 4, "Midfield");

        Goalie keeper = new Goalie("Heinz", "Horvarth", 52, 68, 53,
                87,1, "Goalie", 128, 61);

        Striker striker = new Striker("Kristina", "Rolando",26,98,99,
                94,21,"Striker", 92,244);

        SportsClub amateurClub = new SportsClub("Fc Bodensee", "Bregenz");


        amateurClub.players.add(randomPlayer);
        amateurClub.players.add(keeper);
        amateurClub.players.add(striker);

        amateurClub.showTeam();
        amateurClub.promoteAPlayer(keeper);
        keeper.waveToCrowd();
        keeper.thankTheCoach();

        System.out.println("----------------------------");

        OfficeWorker worker1 = new OfficeWorker("Harald", "Müller", 42,
                "Programmer", 2800);

        OfficeWorker worker2 = new OfficeWorker("Bianca","Fischer",27,
                "Assistant", 1900);

        OfficeWorker worker3 = new OfficeWorker("Lukas", "Hammer", 31,
                "Programmer", 2400);

        Company aCompany = new Company("Java&Stuff", "Dornbirn");

        aCompany.addEmployees(worker1);
        aCompany.addEmployees(worker2);
        aCompany.addEmployees(worker3);

        System.out.println();

        worker1.work();
        worker3.work();
        worker2.takeABreak();

        aCompany.giveRaise(worker2,150);

        aCompany.releaseAProduct("iPhone 73");

        aCompany.printCompanyDetails();

    }

}
