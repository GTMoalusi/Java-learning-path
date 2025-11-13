package Service;

import Model.Address;
import Model.ContactInfo;
import Model.Patient;
import java.util.ArrayList;

public class PatientService {
    //Attributes
    private ArrayList<Patient> patients = new ArrayList<>();

    //Constructor
    public PatientService(){

    }

    //Unique Methods
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
