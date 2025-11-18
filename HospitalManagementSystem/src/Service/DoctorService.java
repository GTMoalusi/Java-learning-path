package Service;

import Model.Patient;

public class DoctorService{

    //Attributes
    private PatientService patientService; //Composition

    //Constructor
    public DoctorService(PatientService patientService){
        this.patientService = patientService;
    }

    public void viewPatientDetails(String patientId) {
        Patient patient = patientService.getPatient(patientId);

        if(patient != null) {
            System.out.println("\n========== Patient Details (Doctor View) ==========");
            patient.displayInfo();
            System.out.println("Doctor's Notes: " + patient.getMedicalNotes());
        } else {
            System.out.println("Patient not found!");
        }
    }

    public void diagnose(String patientId, String diagnosis) {
        Patient patient = patientService.getPatient(patientId);

        if(patient != null) {
            String currentHistory = patient.getMedicalHistory();
            String updatedHistory = currentHistory + " | " + diagnosis;
            patient.setMedicalHistory(updatedHistory);
            System.out.println("✓ Diagnosis added to patient's medical history.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    public void addNotes(String patientId, String notes) {
        Patient patient = patientService.getPatient(patientId);

        if(patient != null) {
            String currentNotes = patient.getMedicalNotes();
            String updatedNotes = currentNotes.isEmpty() ? notes : currentNotes + "\n" + notes;
            patient.setMedicalNotes(updatedNotes);
            System.out.println("✓ Doctor's notes added successfully.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    public void prescribe(String patientId, String prescription) {
        Patient patient = patientService.getPatient(patientId);

        if(patient != null) {
            System.out.println("\n=== Prescription for " + patient.getName() + " ===");
            System.out.println("Prescription: " + prescription);
            // You could add a prescription field to Patient if needed
        } else {
            System.out.println("Patient not found.");
        }
    }
}
