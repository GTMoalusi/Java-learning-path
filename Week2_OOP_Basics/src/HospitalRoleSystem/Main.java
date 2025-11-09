package HospitalRoleSystem;

public class Main {
    public static void main(String[] args) {

        //Static Method
        HospitalRole.HospitalPolicy();
        System.out.println();

        //Objects
        HospitalRole[] roles = {
                new Doctor("Dr Moalusi", "Black", "Male"),
                new Surgeon("Dr Samuel", "White", "Male"),
                new Neurologist("Dr Dlamini", "Black", "Female"),
                new Dentist("Dr Mere", "Coloured", "Male"),
                new Nurse("Ms Williams", "White", "Female"),
                new Receptionist("Ms Makgoana", "Black", "Female"),
                new Patient("Miss Sithole", "Black", "Female")
        };

        for(HospitalRole role : roles){
            System.out.println("===========================");
            System.out.println(role);
            role.performDuty();
            System.out.println();
        }
    }
}
