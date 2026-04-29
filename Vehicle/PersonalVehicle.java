public abstract class PersonalVehicle extends Vehicle{
    protected int passengerCapacity;
    protected boolean hasAC;
    protected double fuelEfficiency;

    public PersonalVehicle(String make, String model, int year, double weight ,int passengerCapacity, boolean hasAC, double fuelEfficiency){
        super(make, model, year, weight);
        this.passengerCapacity = passengerCapacity;
        this.hasAC = hasAC;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String toString(){
        return super.toString() +
        " | Passengers: " + passengerCapacity +
        " | AC: " + (hasAC ? "Yes" : "No") +
        " | Fuel Efficiency: " + fuelEfficiency;    
        }

}