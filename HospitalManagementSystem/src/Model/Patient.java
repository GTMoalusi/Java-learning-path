package Model;

import Interface.Schedulable;

public class Patient extends Person implements Schedulable {
    //Attributes
    private String patientId;
    private String medicalHistory;
    private Address address; //Composition
    private ContactInfo contactInfo; //Composition
    private String medicalNotes;
    private String nursingNotes;

    //Constructor
    public Patient(String name, String gender, int age, String race, String patientId, String medicalHistory, Address address, ContactInfo contactInfo) {
        super(name, gender, age, race);
        this.patientId = patientId;
        this.medicalHistory = medicalHistory;
        this.address = address;
        this.contactInfo = contactInfo;
        this.medicalNotes = "";
        this.nursingNotes = "";
    }

    //Setters
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
    public void setMedicalNotes(String medicalNotes) {
        this.medicalNotes = medicalNotes;
    }
    public void setNursingNotes(String nursingNotes) {
        this.nursingNotes = nursingNotes;
    }

    //Getters
    public String getPatientId() {
        return patientId;
    }
    public String getMedicalHistory() {
        return medicalHistory;
    }
    public Address getAddress() {
        return address;
    }
    public ContactInfo getContactInfo() {
        return contactInfo;
    }
    public String getMedicalNotes() {
        return medicalNotes;
    }
    public String getNursingNotes() {
        return nursingNotes;
    }

    //Unique Methods
    @Override
    public void displayInfo() {
        System.out.println("Patient Details:");
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Age: " + getAge());
        System.out.println("Race: " + getRace());
        System.out.println("Medical History: " + medicalHistory);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contactInfo);
    }

    @Override
    public void scheduleAppointment() {
        System.out.println("The patient must get registered");
    }
}
