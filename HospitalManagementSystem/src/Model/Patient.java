package Model;

public class Patient extends Person{
    //Attributes
    private String patientId;
    private String medicalHistory;
    private Address address; //Composition
    private ContactInfo contactInfo; //Composition

    //Constructor
    public Patient(String name, String gender, int age, String race, String patientId, String medicalHistory, Address address, ContactInfo contactInfo) {
        super(name, gender, age, race);
        this.patientId = patientId;
        this.medicalHistory = medicalHistory;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    //Getters & Setters
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
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

}
