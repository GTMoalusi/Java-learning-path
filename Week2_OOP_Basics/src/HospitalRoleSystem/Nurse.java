package HospitalRoleSystem;

public class Nurse extends Person implements HospitalRole {

    public Nurse(String name, String race, String gender) {
        super(name, race, gender);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " specializes in direct patient care, administering medication, and monitoring vital signs.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
