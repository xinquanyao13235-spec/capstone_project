public class GasolineCar extends Car {

    protected String fuelType;
    protected int tankCapacityGal;

    public GasolineCar(String vehicleID, String make, String model, int year, double weight,
                       double dailyRate, double fuelEfficiency, String fuelType, int tankCapacityGal) {
        super(vehicleID, make, model, year, weight, dailyRate,
              5,             // passengerCapacity
              true,          // hasAC
              fuelEfficiency,// user decides this
              "FWD",         // driveType
              "Sedan",       // bodyStyle
              4,             // numDoor
              "Trunk",       // trunkType
              true,          // isAutomatic
              "V4",          // engineType
              1.5);          // engineSizeL
        this.fuelType = fuelType;
        this.tankCapacityGal = tankCapacityGal;
    }

    // Inherits calculateRentalPrice from Vehicle — no override needed


    public String getComfortFeatures() {
        return "AC: Yes | Passengers: 5 | Drive: FWD";
    }

    
    public String getEngineDetails() {
        return "V4 engine | 1.5L displacement | Automatic";
    }

    
    public void start() {
        System.out.println(make + " " + model + " engine rumbles on.");
    }

    
    public void displayInfo() {
        System.out.println("----------- Gasoline Car Details -----------");
        System.out.println(this.toString());
    }

    public void horn() {
        System.out.println("Beep Beep!");
    }

    public String toString() {
        return super.toString()
             + " | Fuel Type: " + fuelType
             + " | Tank: " + tankCapacityGal + " gal";
    }


}