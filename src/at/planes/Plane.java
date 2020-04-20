package at.planes;

public class Plane {
    public enum KIND {PLANE, CARGOPLANE, AIRLINER}

    private KIND kind;
    private String identification;
    private final double emptyWeight;
    private final double maximumWeight;
    private final double fuelCapacity;
    private double currentFuelLevel;

    public Plane(KIND kind, String identification, final double emptyWeight, final double maximumWeight,
                 final double fuelCapacity) {
        this.kind = kind;
        this.identification = identification;
        this.emptyWeight = emptyWeight;
        this.maximumWeight = maximumWeight;
        this.fuelCapacity = fuelCapacity;
    }

    public void fuel(double fuelInLiters) {
        System.out.println("Adding " + String.format("%.2f",fuelInLiters) + " liters of fuel.");
        if (fuelInLiters > fuelCapacity) {
            System.out.println("Not possible!\nMaximum fuelcapacity is " + String.format("%.2f", fuelCapacity) +
                    " liters.\n");
        }else if(fuelInLiters < 0){
            System.out.println("Not possible\nFuellevel can´t be less than 0 liters.\n");
        }
        else{
            System.out.println( String.format("%.2f",fuelInLiters) + " liters added!");
            this.currentFuelLevel = fuelInLiters;
        }
    }
    public void printFuelLevel(){
        System.out.println("Current Fuellevel: " + String.format("%.2f",currentFuelLevel) + " liters\n");
    }

    @Override
    public String toString() {
        return "\n" + kind +
                "\nIdentification: " + identification +
                "\nEmpty Weight: " + String.format("%.2f", emptyWeight) + " kg" +
                "\nMaximum Weight: " + String.format("%.2f", maximumWeight) + " kg" +
                "\nFuelCapacity: " + String.format("%.2f", fuelCapacity) + " liters" +
                "\nCurrentFuelLevel: " + String.format("%.2f", currentFuelLevel) + " liters";
    }
}
