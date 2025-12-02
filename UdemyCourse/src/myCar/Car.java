package myCar;

public class Car {

    //Fields
    private final String make;
    private final String model;
    private final String color;
    private final int doors;
    private final boolean convertible;

    //Constructor
    public Car(String make, String model, String color, int doors, boolean convertible) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;
    }

    //Methods
    public void describeCar(){
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
