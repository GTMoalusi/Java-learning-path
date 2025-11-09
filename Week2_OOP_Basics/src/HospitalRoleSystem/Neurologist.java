package HospitalRoleSystem;

public class Neurologist extends Doctor implements HospitalRole {

    public Neurologist(String name, String race, String gender) {
        super(name, race, gender);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " specializes in diagnostics and treating and managing conditions affecting the brain, spinal cord, nerves and muscles.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
