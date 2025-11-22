package service;

import model.Patient;

public class NurseService {
    private PatientService patientService;  // Reference to patient data

    // Constructor - receives PatientService
    public NurseService(PatientService patientService) {
        this.patientService = patientService;
    }

    public void viewPatientDetails(String patientId) {
        Patient patient = patientService.getPatient(patientId);

        if(patient != null) {
            System.out.println("\n========== Patient Details (Nurse View) ==========");
            patient.displayInfo();
            System.out.println("Doctor's Notes: " + patient.getMedicalNotes());
            System.out.println("Nursing Notes: " + patient.getNursingNotes());
        } else {
            System.out.println("Patient not found!");
        }
    }

    public void viewDoctorNotes(String patientId) {
        Patient patient = patientService.getPatient(patientId);

        if(patient != null) {
            System.out.println("\n=== Doctor's Notes for " + patient.getName() + " ===");
            System.out.println(patient.getMedicalNotes());
        } else {
            System.out.println("Patient not found!");
        }
    }

    public void addNursingNotes(String patientId, String notes) {
        Patient patient = patientService.getPatient(patientId);

        if(patient != null) {
            String currentNotes = patient.getNursingNotes();
            String updatedNotes = currentNotes.isEmpty() ? notes : currentNotes + "\n" + notes;
            patient.setNursingNotes(updatedNotes);
            System.out.println("✓ Nursing notes added successfully.");
        } else {
            System.out.println("Patient not found.");
        }
    }
}
