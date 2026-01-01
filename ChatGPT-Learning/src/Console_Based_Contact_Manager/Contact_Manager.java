package Console_Based_Contact_Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact_Manager {
    // In memory storage
    static List<Contact> contact_s = new ArrayList<>();

    public static void main(String[] args) {
        // Console Based Contact Manager

        Scanner scanner = new Scanner(System.in);
        boolean sysRunning = true;

        while (sysRunning) {
            System.out.println("================== Contacts ==================");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Search Contact by ID");
            System.out.println("6. Exit Contacts");
            System.out.print("Please enter your choice: ");
            //System.out.println();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    viewContacts();
                    System.out.println();
                    break;
                case 3:
                    updateContact(scanner);
                    break;
                case 4:
                    deleteContact(scanner);
                    break;
                case 5:
                    searchContact(scanner);
                    break;
                case 6:
                    sysRunning = false;
                    System.out.println("Successfully logged out.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println();
        }
        scanner.close();
    }

    static void addContact(Scanner scanner){
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Contact ID: ");
        String contactId = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Email Address: ");
        String emailAddress = scanner.nextLine();

        if (contactIdExists(contactId)){
            System.out.println("Contact ID already exists.");
        } else if (!contactIdExists(contactId)) {
            contact_s.add(new Contact(name, contactId, phoneNumber, emailAddress));
            System.out.println("Contact added successfully.");
        } else  {
            System.out.println("Contact not added successfully.");
        }
    }

    private static boolean contactIdExists(String contactId){
        for (Contact contact : contact_s) {
            if (contact.getContactId().equals(contactId)){
                return true;
            }
        }
        return false;
    }

    static void viewContacts(){
        for (Contact contact : contact_s) {
            System.out.println(contact);
        }
    }

    static void updateContact(Scanner scanner){
        System.out.print("Enter contact ID: ");
        String contactToUpdate = scanner.nextLine();

        boolean contactFound = false;

        for (Contact contact : contact_s) {
            if (contact.getContactId().equals(contactToUpdate)){
                System.out.println("1. Update name: ");
                System.out.println("2. Update contact ID: ");
                System.out.println("3. Update phone number: ");
                System.out.println("4. Update email address: ");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter new name: ");
                        contact.setName(scanner.nextLine());
                        break;
                    case 2:
                        System.out.print("Enter new contact ID: ");
                        contact.setContactId(scanner.nextLine());
                        break;
                    case 3:
                        System.out.print("Enter new phone number: ");
                        contact.setPhoneNumber(scanner.nextLine());
                        break;
                    case 4:
                        System.out.print("Enter new email address: ");
                        contact.setEmailAddress(scanner.nextLine());
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }

                System.out.println("Contact updated successfully.");
                contactFound = true;
                break;
            }
        }

        if (!contactFound){
            System.out.println("Contact not found.");
        }
    }

    static void deleteContact(Scanner scanner){
        System.out.print("Enter contact ID: ");
        String contactIdToDelete = scanner.nextLine();

        for (int i = 0; i < contact_s.size(); i++) {
            Contact contact = contact_s.get(i);

            if (contact.getContactId().equals(contactIdToDelete)){
                System.out.print("You are about to delete this contact. select yes or no: ");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("Yes")){
                    contact_s.remove(i);
                    System.out.println("Contact with contactId: " + contactIdToDelete + " is deleted successfully.");
                } else {
                    System.out.println("Contact deletion failed.");
                }
                return;
            }
        }
        System.out.println("Contact with contactId: " + contactIdToDelete + " not found.");
    }

    static void searchContact(Scanner scanner){
        System.out.print("Enter contact ID: ");
        String contactToSearch = scanner.nextLine();

        boolean contactFound = false;

        for (Contact contact : contact_s) {
            if (contact.getContactId().equals(contactToSearch)) {
                System.out.println(contact);
                contactFound = true;
                break;
            }
        }

        if (!contactFound){
            System.out.println("Contact not found.");
        }
    }
}