public abstract class PersonalVehicle extends Vehicle {

    protected int passengerCapacity;
    protected boolean hasAC;
    protected double fuelEfficiency;
    protected String driveType;
    protected String bodyStyle;

    public PersonalVehicle(String vehicleID, String make, String model, int year, double weight,
                           double dailyRate, int passengerCapacity, boolean hasAC,
                           double fuelEfficiency, String driveType, String bodyStyle) {
        super(vehicleID, make, model, year, weight, dailyRate);
        this.passengerCapacity = passengerCapacity;
        this.hasAC = hasAC;
        this.fuelEfficiency = fuelEfficiency;
        this.driveType = driveType;
        this.bodyStyle = bodyStyle;
    }
    public abstract void start();
    public abstract void displayInfo();
    public abstract void horn();

    public abstract String getComfortFeatures();


    public String toString() {
        return super.toString() +
               " | Passengers: " + passengerCapacity +
               " | AC: " + (hasAC ? "Yes" : "No") +
               " | Fuel Efficiency: " + fuelEfficiency + " mpg" +
               " | Drive Type: " + driveType +
               " | Body Style: " + bodyStyle;
    }

}