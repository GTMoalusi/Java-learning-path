package Composition_Java.Doctor;
public class Doctor {
    //Attribute
    private Department department;
    private String name;

    //Constructor
    public Doctor(Department department, String name){
        this.department = department;
        this.name = name;
    }

    //Unique Method
    @Override
    public String toString(){
        return name + " works in the, " + department + ".";
    }
}
