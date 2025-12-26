package login_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

    // ==================== Storage ====================
    static List<User> users = new ArrayList<>();

    static void register(Scanner scanner) {

        System.out.println("******************** Register Form ********************");

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Please enter your surname: ");
        String surname = scanner.nextLine().trim();

        System.out.print("Please enter your email address: ");
        String email = scanner.nextLine().trim();

        System.out.print("Please create your username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Please create your password: ");
        String password = scanner.nextLine().trim();

        boolean isValid = validatePassword(password, name, surname);

        if (isValid) {
            users.add(new User(name, surname, email, username, password));
            System.out.println("Registration successful.");
        } else {
            System.out.println("Registration not successful.");
        }
    }

    static boolean validatePassword(String password, String name, String surname) {

        boolean symbolFound = false;
        boolean numberFound = false;
        boolean lowercase = false;
        boolean uppercase = false;

        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) symbolFound = true;
            if (Character.isDigit(ch)) numberFound = true;
            if (Character.isLowerCase(ch)) lowercase = true;
            if (Character.isUpperCase(ch)) uppercase = true;

            if (symbolFound && numberFound && lowercase && uppercase) break;
        }

        String lowerPassword = password.toLowerCase();
        String lowerName = name.toLowerCase();
        String lowerSurname = surname.toLowerCase();

        if (!symbolFound) System.out.println("Password must contain at least one symbol.");
        if (!numberFound) System.out.println("Password must contain at least one number.");
        if (!lowercase) System.out.println("Password must contain at least one lowercase.");
        if (!uppercase) System.out.println("Password must contain at least one uppercase.");
        if (password.length() < 8) System.out.println("Password must be at least 8 characters.");
        if (lowerPassword.contains(lowerName) || lowerPassword.contains(lowerSurname))
            System.out.println("Password cannot contain your name or surname.");

        return symbolFound &&
                numberFound &&
                lowercase &&
                uppercase &&
                password.length() >= 8 &&
                !lowerPassword.contains(lowerName) &&
                !lowerPassword.contains(lowerSurname);
    }

    static void login(Scanner scanner) {

        System.out.println("******************** Login ********************");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {
                System.out.println("Login successful.");
                return;
            }
        }

        System.out.println("Invalid username or password.");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running){
            // ==================== Main Menu ====================
            System.out.println("******************** Main Menu ********************");
            System.out.println("1. Register\n2. Login\n3. Exit\n");
            System.out.print("Please select your option from the menu: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                register(scanner);
            } else if (option == 2) {
                login(scanner);
            } else if (option == 3) {
                running = false;
                System.out.println("Successfully logged out.");
            } else {
                System.out.println("Invalid option.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
