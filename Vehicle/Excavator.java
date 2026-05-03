public class Excavator extends ConstructionVehicle {

    protected double bucketCapacityCubicYards;
    protected double armReachFt;

    public Excavator(String vehicleID, String make, String model, int year, double weight,
                     double dailyRate, double bucketCapacityCubicYards, double armReachFt) {
        super(vehicleID, make, model, year, weight, dailyRate,
              22.0,      // maxDigDepthFt
              "Diesel",  // fuelSource
              true);     // hasGPS
        this.bucketCapacityCubicYards = bucketCapacityCubicYards;
        this.armReachFt = armReachFt;
    }

    // Excavators have a 15% heavy equipment surcharge
    public double calculateRentalPrice(int days) {
        return dailyRate * days * 1.15;
    }

    public void start() {
        System.out.println(make + " " + model + " excavator engine fires up.");
    }

    
    public void displayInfo() {
        System.out.println("----------- Excavator Details -----------");
        System.out.println(this.toString());
    }

    
    public void horn() {
        System.out.println("*construction beeping*");
    }

    
    public String getOperationalRequirements() {
        return "Class B CDL | Safety vest | Site permit required";
    }

    public String getDiggingCapacity() {
        return "Dig Depth: 22 ft | Bucket: " + bucketCapacityCubicYards + " cu yd | Reach: " + armReachFt + " ft";
    }

    
    public String toString() {
        return super.toString() +
               " | Bucket Capacity: " + bucketCapacityCubicYards + " cu yd" +
               " | Arm Reach: " + armReachFt + " ft";
    }
}
