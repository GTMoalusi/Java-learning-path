package Person;

public class Person {
    //Attributes
    protected String name;
    protected int age;
    protected String gender;
    protected String race;

    //Constructor
    public Person(String name, int age, String gender, String race){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
    }

    //Unique Method
    public String toString(){
        return "Name: " + name +
                "\nAge: " + age +
                "\nGender: " + gender +
                "\nRace: " + race;
    }

    public void work(){
        System.out.println(name + " is working.");
    }
}
