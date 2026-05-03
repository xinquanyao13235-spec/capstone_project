public abstract class CommercialVehicle extends Vehicle {

    protected double payloadCapacityTons;
    protected boolean requiresCDL;
    protected int numWheels;
    protected String transmissionType;

    public CommercialVehicle(String vehicleID, String make, String model, int year, double weight,
                             double dailyRate, double payloadCapacityTons, boolean requiresCDL,
                             int numWheels, String transmissionType) {
        super(vehicleID, make, model, year, weight, dailyRate);
        this.payloadCapacityTons = payloadCapacityTons;
        this.requiresCDL = requiresCDL;
        this.numWheels = numWheels;
        this.transmissionType = transmissionType;
    }

    public abstract void start();
    public abstract void displayInfo();
    public abstract void horn();

    public abstract String getCargoDetails();


    
    public String toString() {
        return super.toString() +
               " | Payload: " + payloadCapacityTons + " tons" +
               " | CDL Required: " + (requiresCDL ? "Yes" : "No") +
               " | Wheels: " + numWheels +
               " | Transmission: " + transmissionType;
    }
}

