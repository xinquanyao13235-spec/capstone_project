public class Car extends PersonalVehicle{
    protected int numDoor;
    protected String trunkType;
    protected boolean isAutomatic;

    public Car(String make, String model, int year, double weight ,int passengerCapacity, boolean hasAC, double fuelEfficiency, int numDoor, String trunkType, boolean isAutomatic){
        super(make, model, year, weight, passengerCapacity, hasAc, fuelEfficiency);
        this.numDoor = numDoor;
        this.trunkType = trunkType;
        this.isAutomatic = isAutomatic;
    }

    public void displayInfo(){
        System.out.println("-----------Car details-----------" );
        System.out.println(this.toString());
    }

    public void horn(){
        System.out.println("Beep Beep!");
    }

    public String toString(){
        return super.toString() + "| Doors: "+ numDoor+ "; | Trunk-type: " +trunkType+ "; | Automatic: " (isAutomatic ? "Yes":"No");
    }


}