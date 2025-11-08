package Abstraction;
public class Doctor extends Employee implements Workable{

    //Constructor
    public Doctor(String name, int age){
        super(name, age);
    }

    @Override
    public void calculatePay() {
        System.out.println(name + "'s salary is R10,000,000");
    }

    @Override
    public void work() {
        System.out.println(name + " is examining the patient.");
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
