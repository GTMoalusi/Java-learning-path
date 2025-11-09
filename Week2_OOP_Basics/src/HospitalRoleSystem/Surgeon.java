package HospitalRoleSystem;

public class Surgeon extends Doctor implements HospitalRole {

    public Surgeon(String name, String race, String gender) {
        super(name, race, gender);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " specializes in diagnostics and treating conditions through surgery.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
