package login_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

    // ==================== Storage ====================
    static List<User> users = new ArrayList<>();

    public static void main(String[] args) {

        // ==================== Main Menu ====================
        System.out.println("******************** Main Menu ********************");
        System.out.println("1. Register\n2. Login\n3. Exit\n");

        // ==================== Scan user input ====================
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please select your option from the menu: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        // ==================== User Input ====================
        if (option == 1){
            System.out.println("******************** Register Form ********************");
            System.out.print("Please enter your name: ");
            String name = scanner.nextLine();
            name = name.trim(); // Prevents accidental spaces
            System.out.print("Please enter your surname: ");
            String surname = scanner.nextLine();
            surname = surname.trim(); // Prevents accidental spaces
            System.out.print("Please enter your email address: ");
            String email = scanner.nextLine();
            email = email.trim(); // Prevents accidental spaces
            System.out.print("Please create your username: ");
            String username = scanner.nextLine();
            username = username.trim(); // Prevents accidental spaces
            System.out.print("Please create your password: ");
            String password = scanner.nextLine();
            password = password.trim(); // Prevents accidental spaces

            System.out.println();

            // ==================== Boolean Flags ====================
            boolean symbolFound = false;
            boolean numberFound = false;
            boolean lowercase = false;
            boolean uppercase = false;

            // ==================== Password Validation ====================
            for (char ch : password.toCharArray()){
                //Symbol search
                if(!Character.isLetterOrDigit(ch)){
                    symbolFound = true;
                }

                //Number search
                if(Character.isDigit(ch)){
                    numberFound = true;
                }

                //Lowercase search
                if(Character.isLowerCase(ch)){
                    lowercase = true;
                }

                //Uppercase search
                if(Character.isUpperCase(ch)){
                    uppercase = true;
                }

                if (symbolFound && numberFound && lowercase && uppercase){
                    break;
                }
            }

            // ==================== Validation output ====================
            if (!symbolFound){
                System.out.println("Password must contain at least one symbol.");
            }

            if (!numberFound){
                System.out.println("Password must contain at least one number.");
            }

            if (!lowercase){
                System.out.println("Password must contain at least one lowercase.");
            }

            if (!uppercase){
                System.out.println("Password must contain at least one uppercase.");
            }

            if (!(password.length() >= 8)){
                System.out.println("Password length must at least be 8 characters long.");
            }

            String lowerName = name.toLowerCase();
            String lowerSurname = surname.toLowerCase();
            String lowerPassword = password.toLowerCase();

            if(lowerPassword.contains(lowerName) || lowerPassword.contains(lowerSurname)){
                System.out.println("Password cannot contain your name or surname");
            }

            // ==================== Outcome ====================
            if(symbolFound && numberFound && lowercase && uppercase && password.length() >= 8 &&
                    !lowerPassword.contains(lowerName) && !lowerPassword.contains(lowerSurname)){
                users.add(new User(name, surname, email, username, password));
                System.out.println("Registration successful.");
            }else{
                System.out.println("Registration not successful.");
            }
        } else if (option == 2) {

        } else {
            System.out.println("Successfully logged out.");
            scanner.close();
        }
    }
}
