package Model;

public abstract class Person {
    //Attribute
    private String name;
    private String gender;
    private int age;
    private String race;

    //Constructor
    public Person(String name, String gender, int age, String race){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.race = race;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    //Unique Methods
    public String toString(){
        return "\nUserName: " + name +
                "\nGender: " + gender +
                "\nAge: " + age +
                "\nRace: " + race;
    }

    public abstract void displayInfo();  //abstract method
}
