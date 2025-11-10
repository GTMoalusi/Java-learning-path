package Composition_Java;

public class Patient{

    //Attributes
    private Address address;
    private String name;

    //Constructor
    public Patient(Address address, String name){
        this.address = address;
        this.name = name;
    }

    public void showDetails(){
        System.out.println("Patient: " + name + "\nAddress details:" + address);
    }
}
