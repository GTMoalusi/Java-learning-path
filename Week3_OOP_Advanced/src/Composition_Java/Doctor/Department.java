package Composition_Java.Doctor;

public class Department {
    //Attribute
    private String name;

    //Constructor
    public Department(String name){
        this.name = name;
    }

    //Unique Method
    @Override
    public String toString(){
        return name + " Department";
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
