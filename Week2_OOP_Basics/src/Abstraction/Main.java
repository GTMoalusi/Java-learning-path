package Abstraction;

public class Main {
    public static void main(String[] args) {

        //Objects using Employee as Reference
        Employee doctor = new Doctor("Dr Moalusi", 46);
        Employee nurse = new Nurse("Sis Thembi", 29);

        //Objects using Workable as Reference
        //Workable doctor = new HospitalRoleSystem.Doctor("Dr Moalusi", 46);
        //Workable nurse = new HospitalRoleSystem.Nurse("Sis Thembi", 29);

        //Objects
        //HospitalRoleSystem.Doctor doctor = new HospitalRoleSystem.Doctor("Dr Moalusi", 46);
        //HospitalRoleSystem.Nurse nurse = new HospitalRoleSystem.Nurse("Sis Thembi", 29);

        //Polymorphism
        //((Employee) doctor).calculatePay();
        //((Employee)nurse).calculatePay();

        doctor.calculatePay();
        nurse.calculatePay();
        System.out.println();

        //Interface
        ((Workable) doctor).work(); //Works after Casting
        ((Workable) nurse).work();

    }
}
