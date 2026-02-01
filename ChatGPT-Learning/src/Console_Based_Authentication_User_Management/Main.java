package Console_Based_Authentication_User_Management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthService authService = new AuthService();

        boolean running = true;

        while(running){
            System.out.println("\n===== Authentication System =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. View Current User");
            System.out.println("4. Logout");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");

            int choice;

            try{
               choice = Integer.parseInt(scanner.nextLine());
            }catch(IllegalArgumentException e){
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch(choice){
                case 1:
                    handleRegister(scanner, authService);
                    break;
                case 2:
                    handleLogin(scanner, authService);
                    break;
                case 3:
                    handleViewCurrentUser(authService);
                    break;
                case 4:
                    handleLogout(authService);
                    break;
                case 5:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }

    private static void handleRegister(Scanner scanner, AuthService authService){
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try{
            authService.register(username, password);
            System.out.println("User registered successfully.");
        }catch(IllegalArgumentException e){
            System.out.println("Registration failed: " + e.getMessage());
        }
    }

    private static void handleLogin(Scanner scanner, AuthService authService){
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try{
            authService.login(username, password);
            System.out.println("Login successfully.");
        }catch(IllegalArgumentException | IllegalStateException e){
            System.out.println("Login failed: " + e.getMessage());
        }
    }

    private static void handleViewCurrentUser(AuthService authService){
        User currentUser = authService.getCurrentUser();

        if (currentUser == null){
            System.out.println("No user currently logged in.");
        }else {
            System.out.println("Current user: " + currentUser.getUsername());
        }
    }

    private static void handleLogout(AuthService authService){
        try{
            authService.logout();
            System.out.println("Logged out successfully.");
        }catch(IllegalStateException e){
            System.out.println("Logging out failed: " + e.getMessage());
        }
    }
}
