package Model;

public class ContactInfo {
    //Attributes
    private String phoneNumber;
    private String email;

    //Constructor
    public ContactInfo(String phoneNumber, String email){
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //Getters & Setters
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Unique Methods
    @Override
    public String toString(){
        return "Phone number: " + phoneNumber + ", Email address: " + email;
    }
}
