package Service;

import Model.Address;
import Model.ContactInfo;
import Model.Patient;
import java.util.HashMap;
import java.util.Map;

public class PatientService {
    //Attributes
    private Map<String, Patient> patientMap = new HashMap<>();

    //Constructor
    public PatientService(){

    }

    //Unique Methods
    public void registerPatient(Patient patient) {
        String patientId = patient.getPatientId();

        // Check if patient already exists
        if(patientMap.containsKey(patientId)) {
            System.out.println("❌ Patient with ID " + patientId + " already exists!");
            return;
        }

        patientMap.put(patientId, patient);
        System.out.println("✓ Patient registered successfully!");
    }

    // REFACTORED: Instant lookup!
    public Patient getPatient(String patientId) {
        return patientMap.get(patientId);  // Returns null if not found
    }

    public void viewPatientDetails(String patientId) {
        Patient patient = getPatient(patientId);

        if(patient != null){
            patient.displayInfo();
        }else{
            System.out.println("❌ Patient not found.");
        }
    }

    public void updatePatientDetails(String patientId, String medicalHistory,
                                     Address address, ContactInfo contactInfo) {
        Patient patient = getPatient(patientId);

        if(patient != null){
            patient.setMedicalHistory(medicalHistory);
            patient.setAddress(address);
            patient.setContactInfo(contactInfo);
            System.out.println("✓ Patient details updated successfully");
        }else{
            System.out.println("❌ Patient not found.");
        }
    }

    public void removePatient(String patientId) {
        // Hint: Use patientMap.remove(patientId)
        // Check if it was successful (remove returns the removed value, or null)
        Patient removed = patientMap.remove(patientId);

        if(removed != null){
            System.out.println("✓ Patient successfully removed.");
        }else{
            System.out.println("❌ Patient not found.");
        }
    }

    // Helper methods
    public int getTotalPatients() {
        return patientMap.size();
    }

    public void listAllPatientIds() {
        if(patientMap.isEmpty()) {
            System.out.println("No patients registered.");
            return;
        }

        System.out.println("\n=== All Registered Patient IDs ===");
        for(String patientId : patientMap.keySet()) {
            System.out.println("- " + patientId);
        }
    }

    public void listAllPatients() {
        if(patientMap.isEmpty()) {
            System.out.println("No patients registered.");
            return;
        }

        System.out.println("\n=== All Registered Patients ===");
        for(Patient patient : patientMap.values()) {
            patient.displayInfo();
            System.out.println("---");
        }
    }
}
