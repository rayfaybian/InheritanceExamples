package at.sufa2;

public class PassengerPlane extends Plane {
    private int amountOfPassengers;
    private final int maxAmountOfPassengers;
    private int freeSeats;

    public PassengerPlane(Plane.KIND kind, String identification, double emptyWeight, double maximumWeight,
    double fuelCapacity, final int maxAmountOfPassengers) {
        super(kind, identification, emptyWeight, maximumWeight, fuelCapacity);
        this.maxAmountOfPassengers = maxAmountOfPassengers;
        this.freeSeats = maxAmountOfPassengers;
    }


    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public void printAmountOfPassengers() {
        System.out.println(amountOfPassengers + " passengers on board.");
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public void printFreeSeats() {
        System.out.println(freeSeats + " seats available on this plane.");
    }

    public void boarding() {
        System.out.println("Automatic boarding. Filling all seats.");
        if (freeSeats == 0) {
            System.out.println("Plane already full. No seats available!");

        } else {
            this.amountOfPassengers = maxAmountOfPassengers;
            System.out.println("Plane is full! " + maxAmountOfPassengers + " passengers on board.");
        }
    }

    public void boarding(int passengers) {
        System.out.println("Boarding " + passengers + " passengers");
        if (passengers > getFreeSeats()) {
            System.out.println("Not enough seats! Only " + getFreeSeats() +
                    " seats free on this plane.");
        }
        if (passengers <= 0) {
            System.out.println("Are you a ghost?");
        } else {
            this.amountOfPassengers = getAmountOfPassengers() + passengers;
            this.freeSeats = getFreeSeats() - passengers;
            System.out.println(passengers + " Passengers have boarded the plane.\n" + getFreeSeats() +
                    " seats remain empty.");
        }
    }

    public void deBoard() {
        System.out.println("Deboarding all passengers.");
        if (getAmountOfPassengers() < 1) {
            System.out.println("Plane is already empty");
        } else {
            this.amountOfPassengers = 0;
            this.freeSeats = maxAmountOfPassengers;
            System.out.println("All passengers have left the plane.\nAll " + getFreeSeats() + " seats are empty.");
        }
    }

    public void deBoard(int passengers) {
        System.out.println("Deboarding " + passengers + " passengers.");
        if (amountOfPassengers < 1) {
            System.out.println("Plane is already empty.");
        }
        if (getAmountOfPassengers() < passengers) {
            System.out.println("Not possible!\nThere are only " + amountOfPassengers + " passengers on board");
        }
        if (passengers <= 0) {
            System.out.println("No ghosts on board!\nNot possible to deboard 0 peolpe!");
        } else {
            this.amountOfPassengers = getAmountOfPassengers() - passengers;
            this.freeSeats = getFreeSeats() - passengers;
            System.out.println(passengers + " passengers have deboarded the plane.\n" + getFreeSeats() +
                    " seats are empty now.");
        }

    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nMax amount of passengers: " + maxAmountOfPassengers +
                "\nPassengers on Board: " + amountOfPassengers +
                "\nAvailable seats: " + freeSeats;

    }
}





