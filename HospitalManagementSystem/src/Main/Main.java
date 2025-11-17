package Main;

import Model.*;
import Service.DoctorService;
import Service.NurseService;
import Service.PatientService;

public class Main {
    public static void main(String[] args) {

        // Hospital setup
        ContactInfo hospitalContact = new ContactInfo("(011)-2100-342", "customer.service@moalusi.medi.com");
        Hospital hospital = new Hospital("Moalusi Private Hospital", "14th Avenue, Sandton City, Johannesburg", hospitalContact);
        hospital.displayHospitalInfo();

        // Create PatientService FIRST
        PatientService patientService = new PatientService();

        // Create other services and pass PatientService to them
        DoctorService doctorService = new DoctorService(patientService);
        NurseService nurseService = new NurseService(patientService);

        // Register a patient
        Address address = new Address("232", "Viljoen Street", "Krugersdorp", "Gauteng", "1739");
        ContactInfo contactInfo = new ContactInfo("0799977183", "jacob.williams@gmail.com");
        Patient patient1 = new Patient("Jacob Williams", "Male", 76, "White", "2025111402",
                "Heart Disease and Hypertension", address, contactInfo);

        patientService.registerPatient(patient1);

        // Test the workflow
        System.out.println("\n=== Patient Registration ===");
        patientService.viewPatientDetails("2025111402");

        System.out.println("\n=== Doctor Examines Patient ===");
        doctorService.viewPatientDetails("2025111402");
        doctorService.diagnose("2025111402", "Acute chest pain, prescribed beta-blockers");
        doctorService.addNotes("2025111402", "Patient needs close monitoring. Follow-up in 2 weeks.");
        doctorService.prescribe("2025111402", "Metoprolol 50mg twice daily");

        System.out.println("\n=== Nurse Checks Patient ===");
        nurseService.viewPatientDetails("2025111402");
        nurseService.viewDoctorNotes("2025111402");
        nurseService.addNursingNotes("2025111402", "Vitals checked: BP 140/90, HR 78. Patient resting comfortably.");

        System.out.println("\n=== Final Patient Record ===");
        patientService.viewPatientDetails("2025111402");

    }
}
