package Car;
public class Car {

    //Attributes of my car
    final String make;
    final String model;
    final String color;
    final int year;
    private int currentSpeed;

    //Constructor
    Car(String make, String model, String color, int year){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.currentSpeed = 0; //Cars start at 0 speed
    }

    //print everything using toString()
    public String toString(){
        return make+"\n"+model+"\n"+color+"\n"+"Model year: "+year+"\n"+"Current top speed is: "+currentSpeed+"km/hr";
    }

    //Methods
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
        if(speedDecrease > 0 && (currentSpeed -speedDecrease) >= 0){
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
    public void displayInfo(){
        System.out.println("Car Details: " + year + " " + make + " " + model + ", Color: " + color + ", Current speed: " + currentSpeed + " km/hr.");
    }
}
