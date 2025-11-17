package Service;

import Model.Address;
import Model.ContactInfo;
import Model.Patient;
import java.util.ArrayList;
import java.util.List;

public class PatientService {
    //Attributes
    private List<Patient> patients = new ArrayList<>();

    //Constructor
    public PatientService(){

    }

    //Unique Methods
    public Patient getPatient(String patientId) {
        for(Patient patient : patients){
            if(patient.getPatientId().equals(patientId)){
                return patient;  // Return the actual patient object
            }
        }
        return null;  // Patient not found
    }

    public void registerPatient(Patient patient){
        patients.add(patient);
    }

    public void updatePatientDetails(String patientId, String medicalHistory, Address address, ContactInfo contactInfo){
        for(Patient patient : patients){
            if(patient.getPatientId().equals(patientId)){
                patient.setMedicalHistory(medicalHistory);
                patient.setAddress(address);
                patient.setContactInfo(contactInfo);
                System.out.println("Patient details updated successfully!");
                return;
            }
        }
        System.out.println("Patient not found!!!");
    }

    public void removePatient(String patientId){
        for(Patient patient : patients){
            if(patient.getPatientId().equals(patientId)){
                patients.remove(patient);
                System.out.println("Patient successfully removed!!!");
                return;
            }
        }
        System.out.println("Patient not found!!!");
    }

    public void viewPatientDetails(String patientId) {
        for(Patient patient : patients){
            if(patient.getPatientId().equals(patientId)){
                patient.displayInfo();
                return;
            }
        }
        System.out.println("Patient not found!");
    }

}
