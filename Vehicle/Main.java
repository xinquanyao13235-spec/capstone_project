public class Main {
    public static void main(String[] args) {
        // Initialize the Manager with a capacity of 5
        RentalManager myFleet = new RentalManager(5);

        try {
            System.out.println("--- Populating Fleet ---");
            
            // Adding an Electric Car
            myFleet.addVehicle(new ElectricCar("EV-101", "Tesla", "Model 3", 2024, 1800, 150.0, 350, 8.5));
            
            // Adding a Gasoline Car
            myFleet.addVehicle(new GasolineCar("GAS-50", "Honda", "Civic", 2023, 1300, 80.0, 32.5, "Unleaded", 12));
            
            // Adding an Excavator
            myFleet.addVehicle(new Excavator("EX-303", "Caterpillar", "320", 2022, 22500, 500.0, 1.5, 20.0));
            
            // Adding a Heavy Truck
            myFleet.addVehicle(new HeavyTruck("TRK-99", "Kenworth", "T680", 2021, 15000, 300.0, 500));
            
            // Adding a Van
            myFleet.addVehicle(new Van("VN-202", "Ford", "Transit", 2023, 3500, 120.0, 450, 2, true));

            // Display the fleet before sorting
            System.out.println("\nInitial Fleet (Order of Entry):");
            myFleet.printAllVehicles();

            // Sort the fleet using CompareTo (by VehicleID)
            myFleet.sortVehicles();
            System.out.println("\nSorted Fleet (Alphabetical by ID):");
            myFleet.printAllVehicles();

            // Test Recursive Search
            System.out.println("\n--- Testing Search Functionality ---");
            String searchID = "EX-303";
            Vehicle found = myFleet.findVehicleByID(searchID);
            System.out.println("Vehicle Found: " + found.getVehicleID() + " - " + found.getClass().getSimpleName());
            found.start();
            found.horn();  

            // Triggering the Custom Exception (Add to a full fleet)
            System.out.println("\n--- Attempting to overfill fleet ---");
            myFleet.addVehicle(new ElectricCar("EV-999", "Lucid", "Air", 2025, 2100, 200, 400, 6));

        } 

        catch (RentalErrorException e) {
            // Catching logical errors like "Fleet Full" or "ID Not Found"
            System.err.println("SYSTEM ERROR: " + e.getMessage());
        } 

        catch (Exception e) {
            // Catching unexpected runtime issues
            System.err.println("Unexpected error: " + e.toString());
        }
    }
}
