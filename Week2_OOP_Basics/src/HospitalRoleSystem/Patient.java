package HospitalRoleSystem;

public class Patient extends Person implements HospitalRole {

    public Patient(String name, String race, String gender) {
        super(name, race, gender);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void performDuty() {
        System.out.println(name + " must visit the casualty department to be diagnosed and receive medical care.");
    }
}
