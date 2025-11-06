package Person;

public class Main {
    public static void main(String[] args) {

        //doctor and nurse objects
        Doctor doctor = new Doctor("Dr Moalusi", 32, "Male", "Black", "Panado");
        Nurse nurse = new Nurse("Sister Thandi", 28, "Female", "Black", 5);

        //Outputs
        System.out.println("=== Doctor Details ===");
        System.out.println(doctor);
        doctor.prescribeMedicine();

        System.out.println("\n=== Nurse Details ===");
        System.out.println(nurse);
        nurse.assistDoctor();
    }
}
