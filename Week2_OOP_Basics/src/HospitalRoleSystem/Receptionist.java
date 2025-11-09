package HospitalRoleSystem;

public class Receptionist extends Person implements HospitalRole {

    public Receptionist(String name, String race, String gender) {
        super(name, race, gender);
    }

    @Override
    public void performDuty() {
        System.out.println(name + ", manages the reception area, answers & directs phone calls.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
