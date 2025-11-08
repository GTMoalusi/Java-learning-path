package Abstraction;
public class Nurse extends Employee implements Workable{

    //Constructor
    public Nurse(String name, int age){
        super(name, age);
    }

    @Override
    public void calculatePay() {
        System.out.println(name + "'s salary is R16,000");
    }

    @Override
    public void work() {
        System.out.println(name + " is helping the doctor with the patient.");
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
