package Person;
import java.util.Date;

public class Doctor extends Person{

    //Attributes
    private String medicine;
    private Date date;

    //Constructor
    public Doctor(String name, int age, String gender, String race, String medicine) {
        super(name, age, gender, race);
        this.medicine = medicine;
        this.date = new Date();
    }

    //Unique Methods
    public void prescribeMedicine(){
        System.out.println(name + " prescribed: " + medicine + " on " + date);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMedicine: " + medicine +
                "\nDate: " + date;
    }

    //Getters & Setters
    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
