public abstract class Vehicle implements Rentable {

    protected String vehicleID;
    protected String make;
    protected String model;
    protected int year;
    protected double weight;
    protected double dailyRate;
    protected boolean available;

    public Vehicle(String vehicleID, String make, String model, int year, double weight, double dailyRate) {
        this.vehicleID = vehicleID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.weight = weight;
        this.dailyRate = dailyRate;
        this.available = true;
    }

    public double calculateRentalPrice(int days) {
        return dailyRate * days;
    }

    public void start() {
        System.out.println(make + " " + model + " is starting!");
    }

    public boolean equals(Vehicle other) {
        return this.vehicleID.equals(other.vehicleID);
    }

    public int compareByRate(Vehicle other) {
        return Double.compare(this.dailyRate, other.dailyRate);
    }


    public String toString() {
        return "ID: " + vehicleID +
               " | " + make + " " + model + " (" + year + ")" +
               " | Weight: " + weight + " kg" +
               " | $" + dailyRate + "/day" +
               " | Available: " + (available ? "Yes" : "No");
    }

    public String getVehicleID()  { return vehicleID; }
    public double getDailyRate()  { return dailyRate; }
    public boolean isAvailable()  { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public int compareTo(Vehicle other) {
        return this.vehicleID.compareTo(other.vehicleID);
}
