package Car2;

public class Car extends Vehicle{

    //Constructor
    public Car(String model, String make, String color, int doors, int currentSpeed, int yearProduced){
        super(model, make, color, doors, currentSpeed, yearProduced);
    }

    //Unique Methods
    @Override
    public String toString() {
        return super.toString();
    }
}
