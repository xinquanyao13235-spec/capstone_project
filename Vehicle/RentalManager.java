import java.util.Arrays;

public class RentalManager {
    private Vehicle[] vehicles;
    private int count;

    public RentalManager(int capacity) {
        this.vehicles = new Vehicle[capacity];
        this.count = 0;
    }

    public void addVehicle(Vehicle v) {
        if (count < vehicles.length) {
            vehicles[count++] = v;
        }
    }

    /**
     * 1. Sorting method using compareTo()
     * Note: Since Vehicle is abstract, we should implement Comparable<Vehicle> 
     * in the Vehicle class to use this effectively.
     */
    public void sortVehicles() {
        // This assumes Vehicle implements Comparable<Vehicle>
        // based on vehicleID or dailyRate.
        Arrays.sort(vehicles, 0, count);
    }

    /**
     * 2. Recursive search method to find a vehicle by vehicleID
     */
    public Vehicle findVehicleByID(String id) {
        return recursiveSearch(0, id);
    }

    private Vehicle recursiveSearch(int index, String id) {
        // Base case: ID not found or end of array reached
        if (index >= count) {
            return null;
        }
        // Base case: Match found
        if (vehicles[index].getVehicleID().equals(id)) {
            return vehicles[index];
        }
        // Recursive step
        return recursiveSearch(index + 1, id);
    }

    /**
     * 3. Method to print all vehicles in the system
     */
    public void printAllVehicles() {
        System.out.println("=== Current Rental Fleet ===");
        for (int i = 0; i < count; i++) {
            // Polymorphism: calls the specific toString() of the subclass
            System.out.println(vehicles[i].toString());
        }
    }
}
