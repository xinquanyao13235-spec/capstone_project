public abstract class Truck extends CommercialVehicle {

    protected int numAxles;
    protected double bedLengthFt;
    protected boolean hasTowHitch;

    public Truck(String vehicleID, String make, String model, int year, double weight,
                 double dailyRate, double payloadCapacityTons, boolean requiresCDL,
                 int numWheels, String transmissionType, int numAxles,
                 double bedLengthFt, boolean hasTowHitch) {
        super(vehicleID, make, model, year, weight, dailyRate,
              payloadCapacityTons, requiresCDL, numWheels, transmissionType);
        this.numAxles = numAxles;
        this.bedLengthFt = bedLengthFt;
        this.hasTowHitch = hasTowHitch;
    }

    public abstract void start();
    public abstract void displayInfo();
    public abstract void horn();
    public abstract String getCargoDetails();

    public abstract String getTruckClass();
    

    public String toString() {
        return super.toString() +
               " | Axles: " + numAxles +
               " | Bed Length: " + bedLengthFt + " ft" +
               " | Tow Hitch: " + (hasTowHitch ? "Yes" : "No");
    }
}