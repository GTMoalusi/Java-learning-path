package Model;

public class Hospital {
    //Attributes
    private String hospitalName;
    private String hospitalAddress;
    private ContactInfo contactInfo;

    //Constructor
    public Hospital(String hospitalName, String hospitalAddress, ContactInfo contactInfo){
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.contactInfo = contactInfo;
    }

    //Getters
    public String getHospitalName() {
        return hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    //Display hospital info
    public void displayHospitalInfo(){
        System.out.println("========================================");
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Address: " + hospitalAddress);
        System.out.println("Contact: " + contactInfo);
        System.out.println("========================================");
    }
}
