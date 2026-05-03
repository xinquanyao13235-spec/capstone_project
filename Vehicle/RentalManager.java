import java.util.Arrays;

public class RentalManager {
    private Vehicle[] vehicles;
    private int count;

    public RentalManager(int capacity) {
        this.vehicles = new Vehicle[capacity];
        this.count = 0;
    }

    public void addVehicle(Vehicle v) throws RentalErrorException {
        if (count >= vehicles.length) {
            throw new RentalErrorException("Cannot add vehicle: Rental fleet is at maximum capacity.");
        }
        vehicles[count++] = v;
    }

     // Sorting method using compareTo()
     
    public void sortVehicles() {
        Arrays.sort(vehicles, 0, count);
    }

    // Recursive search method to find a vehicle by vehicleID
    
    public Vehicle findVehicleByID(String id) throws RentalErrorException {
        Vehicle found = recursiveSearch(0, id);
        if (found == null) {
            throw new RentalErrorException("Search Failed: Vehicle with ID " + id + " does not exist.");
        }
        return found;
    }

    private Vehicle recursiveSearch(int index, String id) {
        if (index >= count) return null;
        if (vehicles[index].getVehicleID().equalsIgnoreCase(id)) {
            return vehicles[index]; // Found in Vehicle base class
        }
        return recursiveSearch(index + 1, id);
    }

    
    // 3. Method to print all vehicles in the system
    
    public void printAllVehicles() {
        System.out.println("=== Current Rental Fleet ===");
        for (int i = 0; i < count; i++) {
            System.out.println(vehicles[i].toString());
        }
    }
}
