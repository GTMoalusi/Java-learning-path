package HospitalRoleSystem;

public abstract class Person {
    //Attributes
    protected String name;
    protected String race;
    protected String gender;

    //Constructor
    public Person(String name, String race, String gender){
        this.name = name;
        this.race = race;
        this.gender = gender;
    }

    //Unique Method
    public String toString(){
        return "Your name is: " + name +
                "\nYour race: " + race +
                "\nYou are a " + gender;
    }

    //Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
