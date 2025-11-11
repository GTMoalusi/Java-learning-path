package Composition_Java.Computer_CPU;

public class CPU {

    //Attribute
    private String model;

    public CPU(String model){
        this.model = model;
    }

    //Getter & Setter

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void processing(){
        System.out.println("You are using an " + model + " CPU.");
    }
}
