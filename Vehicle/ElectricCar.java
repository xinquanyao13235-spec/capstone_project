public class ElectricCar extends Car {

    protected int batteryRangeMiles;

    public ElectricCar(String vehicleID, String make, String model, int year, double weight,
                       double dailyRate, int batteryRangeMiles) {
        super(vehicleID, make, model, year, weight, dailyRate, 5, true, 0, 4, "Hatchback", true);
        this.batteryRangeMiles = batteryRangeMiles;
    }