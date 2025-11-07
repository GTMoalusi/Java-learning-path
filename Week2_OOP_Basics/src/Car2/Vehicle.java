package Car2;

public class Vehicle {
    //Attributes
    protected String model;
    protected String make;
    protected String color;
    protected int doors;
    protected  int currentSpeed;
    protected int yearProduced;

    //Constructor
    public Vehicle(String model, String make, String color, int doors, int currentSpeed, int yearProduced){
        this.model = model;
        this.make = make;
        this.color = color;
        this.doors = doors;
        this.yearProduced = yearProduced;
        this.currentSpeed = 0;
    }

    //Unique Methods
    @Override
    public String toString(){
        return "Vehicle model is: " + model +
                "\nVehicle make is: " + make +
                "\nVehicle was produced during: " + yearProduced +
                "\nVehicle color is: " + color +
                "\nVehicle has " + doors + " doors." +
                "\nVehicle current speed is: " + currentSpeed;
    }

    public void startEngine(){
        System.out.println("The " + make + " " + model + "'s engine is starting.");
    }
    public void accelerate(int speedIncrease){
        if(speedIncrease > 0){
            currentSpeed += speedIncrease;
            System.out.println("The " + make + " " + model + " is accelerating to " + currentSpeed + " km/hr.");
        }
    }
    public void brake(int speedDecrease){
        if(speedDecrease > 0 && (currentSpeed - speedDecrease) >= 0){
            currentSpeed -= speedDecrease;
            System.out.println("The " + make + " " + model + " is braking to " + currentSpeed + " km/hr.");
        }else if((currentSpeed - speedDecrease) < 0){
            currentSpeed = 0;
            System.out.println("The " + make + " " + model + " has stopped.");
        }
    }
    public void stopEngine(){
        System.out.println("The " + make + " " + model + "'s engine is stopping.");
        currentSpeed = 0;
    }
    public void turnRight(){
        System.out.println("The " + make + " " + model + " is turning to the right.");
    }
    public void turnLeft(){
        System.out.println("The " + make + " " + model + " is turning to the left.");
    }
    public void goStraight(){
        System.out.println("The " + make + " " + model + " is going in a straight line.");
    }
    public void goInReverse(){
        System.out.println("The " + make + " " + model + " is going in reverse.");
    }
}
