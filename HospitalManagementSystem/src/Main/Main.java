package Main;

import Model.*;
import Service.PatientService;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n=== Testing Schedulable Interface ===");

        Doctor doctor = new Doctor("Dr Thabang Moalusi", "Male", 34, "Black", "1000001",
                "Cardiologist", "Cardiology");

        Nurse nurse = new Nurse("Sis Thembi", "Female", 29, "Black", "100002",
                "Cardiology", "Cardiology");

        Address address = new Address("232", "Viljoen Street", "Krugersdorp", "Gauteng", "1739");
        ContactInfo contactInfo = new ContactInfo("0799977183", "jacob.williams@gmail.com");
        Patient patient = new Patient("Jacob Williams", "Male", 76, "White", "2025111402",
                "Heart Disease and Hypertension", address, contactInfo);

        doctor.scheduleAppointment();
        nurse.scheduleAppointment();
        patient.scheduleAppointment();

        System.out.println();

        doctor.displayInfo();
        System.out.println();
        nurse.displayInfo();
        System.out.println();
        patient.displayInfo();
    }
}
