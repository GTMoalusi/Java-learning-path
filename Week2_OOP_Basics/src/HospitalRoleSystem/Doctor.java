package HospitalRoleSystem;

public class Doctor extends Person implements HospitalRole {

    public Doctor(String name, String race, String gender) {
        super(name, race, gender);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " specializes in diagnostics and treating common illnesses, managing chronic conditions.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
