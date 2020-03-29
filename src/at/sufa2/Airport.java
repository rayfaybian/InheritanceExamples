package at.sufa2;

public class Airport {

    public static void main(String[] args) {
        Plane cessna = new Plane(Plane.KIND.PLANE,"AT1248",984,
                1812,290);

        CargoPlane antonovA400 = new CargoPlane(Plane.KIND.CARGOPLANE,
                "US4587",129480,620000,725000);

        Airliner airbusA320 = new Airliner(Plane.KIND.AIRLINER,"DE9675",50000,
                78000,30190,150);


        System.out.println("\n\n___Small Plane___\n");//only to see where each plane starts in the console
        cessna.printFuelLevel();
        cessna.fuel(300);
        cessna.printFuelLevel();
        cessna.fuel(148);
        cessna.printFuelLevel();
        System.out.println(cessna.toString());

        System.out.println("\n\n___Cargo Plane___\n");//only to see where each plane starts in the console
        antonovA400.printFuelLevel();
        antonovA400.fuel(895724);
        antonovA400.printFuelLevel();
        antonovA400.fuel(712483);
        antonovA400.printFuelLevel();
        antonovA400.printCurrentWeight();
        antonovA400.load(500000);
        antonovA400.load(250000);
        antonovA400.printCurrentWeight();
        antonovA400.unload(300000);
        antonovA400.unload(120000);
        antonovA400.printCurrentWeight();
        System.out.println(antonovA400.toString());

        System.out.println("\n\n___Passenger Plane___\n");//only to see where each plane starts in the console
        airbusA320.printFuelLevel();
        airbusA320.fuel(25000);
        airbusA320.printFuelLevel();
        airbusA320.printFreeSeats();
        airbusA320.printAmountOfPassengers();
        airbusA320.boarding();
        airbusA320.deBoard(42);
        airbusA320.boarding(5);
        airbusA320.printAmountOfPassengers();
        airbusA320.deBoard();
        System.out.println(airbusA320.toString());










}}
