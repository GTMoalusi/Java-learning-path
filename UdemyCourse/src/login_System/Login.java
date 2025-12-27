package login_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

    static List<User> users = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("******************** Main Menu ********************");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Admin Panel");
            System.out.println("4. Exit");
            System.out.print("Please select your option from the menu: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    register(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    adminPanel(scanner);
                    break;
                case 4:
                    running = false;
                    System.out.println("Successfully logged out.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

            System.out.println();
        }

        scanner.close();
    }

    // ==================== Registration ====================
    private static void register(Scanner scanner) {

        System.out.println("******************** Register Form ********************");

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Please enter your surname: ");
        String surname = scanner.nextLine().trim();

        System.out.print("Please enter your email address: ");
        String email = scanner.nextLine().trim();

        System.out.print("Please create your username: ");
        String username = scanner.nextLine().trim();

        if (usernameExists(username)) {
            System.out.println("Username already exists. Please choose another one.");
            return;
        }

        System.out.print("Please create your password: ");
        String password = scanner.nextLine().trim();

        boolean valid = validatePassword(password, name, surname);

        if (valid) {
            users.add(new User(name, surname, email, username, password));
            System.out.println("Registration successful.");
        } else {
            System.out.println("Registration not successful.");
        }
    }

    // ==================== Login ====================
    private static void login(Scanner scanner) {

        System.out.println("******************** Login ********************");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user : users) {

            if (user.getUsername().equalsIgnoreCase(username)) {

                // Allow correct password to unlock
                if (user.getPassword().equals(password)) {
                    user.resetFailedAttempts();
                    user.unlock();
                    System.out.println("Login successful.");
                    return;
                }

                if (user.isLocked()) {
                    System.out.println("Account is locked.");
                    System.out.println("1. Request admin unlock");
                    System.out.println("2. Forgot password");
                    System.out.print("Select option: ");

                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    if (choice == 1) {
                        user.requestUnlock();
                        System.out.println("Unlock request sent to admin.");
                    } else if (choice == 2) {
                        recoverAccount(scanner, user);
                    }
                    return;
                }

                user.incrementFailedAttempts();
                System.out.println("Invalid password. Attempt "
                        + user.getFailedAttempts() + " of 3.");
                return;
            }
        }

        System.out.println("Username not found.");
    }

    // ==================== Password Recovery ====================
    private static void recoverAccount(Scanner scanner, User user) {

        System.out.print("Enter your registered email: ");
        String emailInput = scanner.nextLine().trim();

        if (!user.getEmail().equalsIgnoreCase(emailInput)) {
            System.out.println("Email does not match our records.");
            return;
        }

        // Simulated OTP
        String otp = String.valueOf((int) (Math.random() * 900000) + 100000);
        user.setOtp(otp);

        System.out.println("OTP sent to email (SIMULATED): " + otp);

        System.out.print("Enter OTP: ");
        String inputOtp = scanner.nextLine();

        if (!user.verifyOtp(inputOtp)) {
            System.out.println("Invalid OTP.");
            return;
        }

        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine().trim();

        user.setPassword(newPassword);
        user.unlock();

        System.out.println("Password reset successful. Account unlocked.");
    }

    // ==================== Admin Panel ====================
    private static void adminPanel(Scanner scanner) {

        System.out.println("******************** Admin Panel ********************");

        boolean found = false;

        for (User user : users) {
            if (user.isUnlockRequested()) {
                found = true;
                System.out.println("Unlock request from user: " + user.getUsername());
                System.out.print("Approve unlock? (yes/no): ");
                String decision = scanner.nextLine();

                if (decision.equalsIgnoreCase("yes")) {
                    user.unlock();
                    System.out.println("User unlocked.");
                } else {
                    System.out.println("Request denied.");
                }
            }
        }

        if (!found) {
            System.out.println("No pending unlock requests.");
        }
    }

    // ==================== Helpers ====================
    private static boolean usernameExists(String username) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    private static boolean validatePassword(String password, String name, String surname) {

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
}
