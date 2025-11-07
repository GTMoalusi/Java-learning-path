package Car2;

public class Bicycle extends Vehicle{

    //Attribute
    private int paddles;

    //Constructor
    public Bicycle(String model, String make, String color, int doors, int currentSpeed, int paddles, int yearProduced){
        super(model, make, color, doors, currentSpeed,yearProduced);
        this.paddles = paddles;
    }

    //Unique Methods
    @Override
    public String toString() {
        return super.toString() + "\nBicycle has " + paddles + " paddles.";
    }

    //Getters & Setters
    public int getPaddles() {
        return paddles;
    }

    public void setPaddles(int paddles) {
        this.paddles = paddles;
    }
}
