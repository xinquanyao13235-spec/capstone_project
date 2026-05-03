public class Van extends CommercialVehicle {

    protected int cargoVolumeCubicFt;
    protected int passengerCapacity;
    protected boolean hasSlidingDoor;

    public Van(String vehicleID, String make, String model, int year, double weight,
               double dailyRate, int cargoVolumeCubicFt, int passengerCapacity, boolean hasSlidingDoor) {
        super(vehicleID, make, model, year, weight, dailyRate,
              0.5,        // payloadCapacityTons
              false,      // requiresCDL
              4,          // numWheels
              "Automatic");// transmissionType
        this.cargoVolumeCubicFt = cargoVolumeCubicFt;
        this.passengerCapacity = passengerCapacity;
        this.hasSlidingDoor = hasSlidingDoor;
    }

    public void start() {
        System.out.println(make + " " + model + " van starts smoothly.");
    }

    public void displayInfo() {
        System.out.println("----------- Van Details -----------");
        System.out.println(this.toString());
    }

   
    public void horn() {
        System.out.println("Beep!");
    }

    public String getCargoDetails() {
        return "Cargo: " + cargoVolumeCubicFt + " cu ft | Passengers: " + passengerCapacity;
    }

    public String toString() {
        return super.toString() +
               " | Cargo: " + cargoVolumeCubicFt + " cu ft" +
               " | Passengers: " + passengerCapacity +
               " | Sliding Door: " + (hasSlidingDoor ? "Yes" : "No");
    }
}