public class Motorcycle extends PersonalVehicle {

    protected String motorcycleType;
    protected boolean hasSidecar;

    public Motorcycle(String vehicleID, String make, String model, int year, double weight,
                      double dailyRate, String motorcycleType, boolean hasSidecar) {
        super(vehicleID, make, model, year, weight, dailyRate,
              2,              // passengerCapacity
              false,          // hasAC
              45.0,           // fuelEfficiency
              "RWD",          // driveType
              "Motorcycle");  // bodyStyle
        this.motorcycleType = motorcycleType;
        this.hasSidecar = hasSidecar;
    }

    // Gets 10% off
    public double calculateRentalPrice(int days) {
        return dailyRate * days * 0.90;
    }

    
    public String getComfortFeatures() {
        return "No AC | Passengers: 2 | Drive: RWD";
    }

    
    public void start() {
        System.out.println(make + " " + model + " roars to life!");
    }

    public void displayInfo() {
        System.out.println("----------- Motorcycle Details -----------");
        System.out.println(this.toString());
    }

    public void horn() {
        System.out.println("VROOM VROOM!");
    }

    public String toString() {
        return super.toString()
             + " | Type: " + motorcycleType
             + " | Sidecar: " + (hasSidecar ? "Yes" : "No");
    }
}
