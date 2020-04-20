package at.planes;

public class CargoPlane extends Plane {
    private double cargo;
    private double maxCargoCapacity;
    private double remainingCargoWeight;
    private double currentWeight;


    public CargoPlane(KIND kind, String identification, double emptyWeight, double maximumWeight, double fuelCapacity) {
        super(kind,identification, emptyWeight, maximumWeight, fuelCapacity);
        this.currentWeight = emptyWeight;
        this.remainingCargoWeight = maximumWeight - emptyWeight;
        this.maxCargoCapacity = remainingCargoWeight;

    }
    public double getCargo() {
        return cargo;
    }

    public double getRemainingCargoWeight() {
        return remainingCargoWeight;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void load(double loadCargo) {
        System.out.println("Loading " + String.format("%.2f",loadCargo) + " kg of cargo.");
        if ((getCargo() + loadCargo) > getRemainingCargoWeight()) {
            System.out.println("Plane overloaded! You can only loadCargo " + String.format("%.2f", getRemainingCargoWeight()) + " kg of cargo.");
        } else {
            this.cargo = getCargo() + loadCargo;
            this.currentWeight = getCurrentWeight() + getCargo();
            this.remainingCargoWeight = remainingCargoWeight - getCargo();
            System.out.println("Cargo loaded!");
        }
    }
    public void unload(double unloadCargo) {
        System.out.println("Unloading " + String.format("%.2f",unloadCargo) + " kg of cargo.");
        if (unloadCargo > getCargo()) {
            System.out.println("Number to high. You can only unload " + String.format("%.2f",getCargo()) + " kg of cargo.");
        } else {
            this.cargo = getCargo() - unloadCargo;
            this.currentWeight = getCurrentWeight() - unloadCargo;
            System.out.println("Cargo unloaded!");
        }
    }
    public void printCurrentWeight(){
        System.out.println("Current weight: " + String.format("%.2f",getCurrentWeight())+ " kg");
    }

    @Override
    public String toString() {
        return
                super.toString() +
                        "\nCargo Capacity Max: " + maxCargoCapacity + " kg" +
                "\nCargo loaded: " + cargo +" kg" +
                "\nRemaining Cargo Weight: " + remainingCargoWeight +" kg" +
                "\nCurrent Weight: " + currentWeight + " kg";
    }
}
