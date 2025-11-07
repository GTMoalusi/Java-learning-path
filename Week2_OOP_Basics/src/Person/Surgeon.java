package Person;

public class Surgeon extends Doctor{

    //Constructor
    public Surgeon(String name, int age, String gender, String race, String medicine) {
        super(name, age, gender, race, medicine);
    }

    //Unique Method
    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public void work(){
        System.out.println(name + " is with a patient in the theater room.");
    }
}
