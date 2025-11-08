package Abstraction;
public abstract class Employee {

    //Attributes
    protected String name;
    protected int age;

    //Constructor
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Unique Method
    public String toString(){
        return "Name is " + name;
    }

    //Abstract Method
    public abstract void calculatePay();

}
