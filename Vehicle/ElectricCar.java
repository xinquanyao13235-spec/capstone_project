public class ElectricCar extends Car {

    protected int batteryRangeMiles;
    protected double chargeTimehours;


    public ElectricCar(String vehicleID, String make, String model, int year, double weight,
                       double dailyRate, int batteryRangeMiles, double chargeTimeHours) {

        super(vehicleID, make, model, year, weight, dailyRate,
              5,        // passengerCapacity
              true,     // hasAC
              0,        // fuelEfficiency (electric — no fuel)
              "AWD",    // driveType
              "Sedan",  // bodyStyle
              4,        // numDoor
              "Trunk",  // trunkType
              true,     // isAutomatic
              "Electric", // engineType
              0.0);     // engineSizeL (electric — no displacement)
        this.batteryRangeMiles = batteryRangeMiles;
        this.chargeTimehours = chargeTimeHours;
    }

    // 10% discount for the electric car.
    public double calculateRentalPrice(int days) {
        return dailyRate * days * 0.90;
    }

    // required by PersonalVehicle
    public String getComfortFeatures() {
        return "AC: Yes | Passengers: 5 | Drive: AWD";
    }


    // required by Car
    public String getEngineDetails() {
        return "Electric motor | No displacement | Always automatic";
    }


    // required by Vehicle
    public void start() {
        System.out.println(make + " " + model + " powers on silently.");
    }

    public void displayInfo() {
        System.out.println("----------- Electric Car Details -----------");
        System.out.println(this.toString());
    }

    public void horn() {
        System.out.println("Whoooosh! (Electric horn)");
    }

    

    public String toString() {
        return super.toString() +
               " | Battery Range: " + batteryRangeMiles + " miles" +
               " | Charge Time: " + chargeTimehours + " hrs";
    }
}