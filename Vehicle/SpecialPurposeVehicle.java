public abstract class SpecialPurposeVehicle extends Vehicle {

    protected String specialization;
    protected String operatorLicenseRequired;
    protected double maxOperatingWeightTons;

    public SpecialPurposeVehicle(String vehicleID, String make, String model, int year, double weight,
                                 double dailyRate, String specialization,
                                 String operatorLicenseRequired, double maxOperatingWeightTons) {
        super(vehicleID, make, model, year, weight, dailyRate);
        this.specialization = specialization;
        this.operatorLicenseRequired = operatorLicenseRequired;
        this.maxOperatingWeightTons = maxOperatingWeightTons;
    }

    public abstract void start();
    public abstract void displayInfo();
    public abstract void horn();

    public abstract String getOperationalRequirements();
    
    public String toString() {
        return super.toString() +
               " | Specialization: " + specialization +
               " | License Required: " + operatorLicenseRequired +
               " | Max Operating Weight: " + maxOperatingWeightTons + " tons";
    }
}
