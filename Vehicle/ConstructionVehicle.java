public abstract class ConstructionVehicle extends SpecialPurposeVehicle {

    protected double maxDigDepthFt;
    protected String fuelSource;
    protected boolean hasGPS;

    public ConstructionVehicle(String vehicleID, String make, String model, int year, double weight,
                               double dailyRate, double maxDigDepthFt,
                               String fuelSource, boolean hasGPS) {
        super(vehicleID, make, model, year, weight, dailyRate,
              "Construction",  // specialization
              "Class B CDL",   // operatorLicenseRequired
              40.0);           // maxOperatingWeightTons
        this.maxDigDepthFt = maxDigDepthFt;
        this.fuelSource = fuelSource;
        this.hasGPS = hasGPS;
    }

    public abstract void start();
    public abstract void displayInfo();
    public abstract void horn();
    public abstract String getOperationalRequirements();

    public abstract String getDiggingCapacity();

    public String toString() {
        return super.toString() +
               " | Max Dig Depth: " + maxDigDepthFt + " ft" +
               " | Fuel Source: " + fuelSource +
               " | GPS: " + (hasGPS ? "Yes" : "No");
    }
}