package Main;

import Model.Address;
import Model.ContactInfo;
import Model.Hospital;
import Model.Patient;
import Service.PatientService;

public class Main {
    public static void main(String[] args) {

        ContactInfo hospitalContacts = new ContactInfo("(011)-952-2234", "moalusi.privatehospital@medi.co.za");
        Hospital hospital = new Hospital("Moalusi Private Hospital", "14th Avenue, Sandton City, Johannesburg", hospitalContacts);

        hospital.displayHospitalInfo();
        System.out.println();

        PatientService patientService = new PatientService();
        Address address = new Address("Unit 20", "Robert broom drive", "Krugersdorp", "Gauteng", "1739");
        ContactInfo patient_1 = new ContactInfo("0799977183", "thabang.moalusi@yahoo.com");
        Patient patient = new Patient("Thabang Moalusi", "Male", 32, "Black", "2025111301",
                "No record", address, patient_1);

        patientService.registerPatient(patient);
        patientService.viewPatientDetails("2025111301");
        System.out.println();
        patientService.updatePatientDetails("2025111301", "Headache and Fever", address, patient_1);
        patientService.viewPatientDetails("2025111301");
        System.out.println();
        patientService.removePatient("2025111301");
        patientService.viewPatientDetails("2025111301");
    }
}
