package HospitalRoleSystem;

public class Dentist extends Doctor implements HospitalRole {

    public Dentist(String name, String race, String gender) {
        super(name, race, gender);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " specializes in diagnostics and treating diseases of the teeth, gums, and mouth.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
