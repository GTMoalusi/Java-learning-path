package Person;

public class Nurse extends Person{
    //Attributes
    private int experience;

    //Constructor
    public Nurse(String name, int age, String gender, String race, int experience){
        super(name, age, gender, race);
        this.experience = experience;
    }

    // Unique method
    public void assistDoctor() {
        System.out.println(name + " is assisting the doctor with patient care.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nYears of Experience: " + experience;
    }

    //Getters & Setters
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
