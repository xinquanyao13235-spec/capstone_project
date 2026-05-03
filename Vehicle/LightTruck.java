public class LightTruck extends Truck {

    protected String cabStyle;  

    public LightTruck(String vehicleID, String make, String model, int year, double weight,
                      double dailyRate, String cabStyle) {
        super(vehicleID, make, model, year, weight, dailyRate,
              1.5,        // payloadCapacityTons
              false,      // requiresCDL
              4,          // numWheels
              "Automatic",// transmissionType
              2,          // numAxles
              6.5,        // bedLengthFt
              true);      // hasTowHitch
        this.cabStyle = cabStyle;
    }

    
    public void start() {
        System.out.println(make + " " + model + " light truck starts up.");
    }

    
    public void displayInfo() {
        System.out.println("----------- Light Truck Details -----------");
        System.out.println(this.toString());
    }

   
    public void horn() {
        System.out.println("Honk Honk!");
    }

    
    public String getCargoDetails() {
        return "Payload: 1.5 tons | Bed: 6.5 ft | No CDL needed";
    }

    
    public String getTruckClass() {
        return "Class 2 - Light Duty";
    }

    public String toString() {
        return super.toString() +
               " | Cab Style: " + cabStyle;
    }
}