public class HeavyTruck extends Truck {

    protected int horsepower;

    public HeavyTruck(String vehicleID, String make, String model, int year, double weight,
                      double dailyRate, int horsepower) {
        super(vehicleID, make, model, year, weight, dailyRate,
              10.0,       // payloadCapacityTons
              true,       // requiresCDL
              18,         // numWheels
              "Manual",   // transmissionType
              4,          // numAxles
              14.0,       // bedLengthFt
              true);      // hasTowHitch
        this.horsepower = horsepower;
    }

    public double calculateRentalPrice(int days) {
        return dailyRate * days * 1.20;
    }

    public void start() {
        System.out.println(make + " " + model + " heavy truck rumbles to life.");
    }

    
    public void displayInfo() {
        System.out.println("----------- Heavy Truck Details -----------");
        System.out.println(this.toString());
    }

    
    public void horn() {
        System.out.println("BLAAAAARRRT! (Air horn)");
    }

    public String getCargoDetails() {
        return "Payload: 10 tons | Bed: 14 ft | CDL required";
    }

    public String getTruckClass() {
        return "Class 8 - Heavy Duty";
        }

    public String toString() {
        return super.toString() +
               " | Horsepower: " + horsepower + " hp";
    }
}