public abstract class Vehicle{
    
    protected String make;
    protected String model;
    protected int year;
    protected double weight;

    public Vehicle(String make, String model, int year, double weight){
        this.make = make;
        this.model = model;
        this.year = year;
        this.weight = weight;
    }

    public abstract void displayInfo();

    public void start(){
        System.out.println(make + " is starting!");
    }  

    public abstract void horn();

    public String toString() {
    return make + " " + model + " (" + year + ") - Weight: " + weight + " kg";
    }
}
