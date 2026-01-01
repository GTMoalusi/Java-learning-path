package Console_Based_Contact_Manager;

public class Contact {

    // Fields
    private String name;
    private String contactId;
    private String phoneNumber;
    private String emailAddress;

    // Constructor
    public Contact(String name, String contactId, String phoneNumber, String emailAddress) {
        this.name = name;
        this.contactId = contactId;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Getters
    public String getContactId() {
        return contactId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    // Setters
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Name = " + name +
                "\nContactId = " + contactId +
                "\nPhoneNumber = " + phoneNumber +
                "\nEmailAddress = " + emailAddress;
    }
}
