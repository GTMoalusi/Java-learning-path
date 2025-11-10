package Person;

public class Main {
    public static void main(String[] args) {

        //HospitalRoleSystem.Person Object (Polymorphism)
        Person person1 = new Doctor("Dr Moalusi", 32, "Male", "Black", "Panado");
        Person person2 = new Nurse("Sister Thandi", 28, "Female", "Black", 5);

        //HospitalRoleSystem.Doctor and HospitalRoleSystem.Nurse Objects
        Doctor doctor = new Doctor("Dr Moalusi", 32, "Male", "Black", "Panado");
        Nurse nurse = new Nurse("Sister Thandi", 28, "Female", "Black", 5);

        //Outputs
        System.out.println("=== HospitalRoleSystem.Doctor Details ===");
        System.out.println(doctor);
        doctor.prescribeMedicine();

        System.out.println("\n=== HospitalRoleSystem.Nurse Details ===");
        System.out.println(nurse);
        nurse.assistDoctor();

        System.out.println();

        Person[] persons = {person1, person2};

        for(Person human : persons){
            human.work();
        }
        System.out.println();

        //Overridden Method
        Doctor person3 = new Surgeon("Dr Gideon",42,"Male","White", "Operation");

        person3.work();
    }
}
