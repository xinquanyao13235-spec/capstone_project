public abstract class Car extends PersonalVehicle {

    protected int numDoor;
    protected String trunkType;
    protected boolean isAutomatic;
    protected String engineType;
    protected double engineSizeL;

    public Car(String vehicleID, String make, String model, int year, double weight,
               double dailyRate, int passengerCapacity, boolean hasAC, double fuelEfficiency,
               String driveType, String bodyStyle, int numDoor, String trunkType,
               boolean isAutomatic, String engineType, double engineSizeL) {
        super(vehicleID, make, model, year, weight, dailyRate,
              passengerCapacity, hasAC, fuelEfficiency, driveType, bodyStyle);
        this.numDoor = numDoor;
        this.trunkType = trunkType;
        this.isAutomatic = isAutomatic;
        this.engineType = engineType;
        this.engineSizeL = engineSizeL;
    }

    public String toString() {
        return super.toString() +
               " | Doors: " + numDoor +
               " | Trunk-type: " + trunkType +
               " | Automatic: " + (isAutomatic ? "Yes" : "No") +
               " | Engine: " + engineType +
               " | Engine Size: " + engineSizeL + "L";
    }
}