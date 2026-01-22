package Console_Based_Expense_Tracker;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseTracker tracker = new ExpenseTracker();

        boolean isRunning = true;

        while(isRunning){
            System.out.println("\n==== Expense Tracker ====");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. View Total of Expenses");
            System.out.println("4. Exit Program");

            System.out.print("Choose an option: ");

            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a number");
                continue;
            }

            switch (choice){
                case 1:
                    handleAddExpense(scanner, tracker);
                    break;
                case 2:
                    handleViewExpenses(tracker);
                    break;
                case 3:
                    handleViewTotalExpenses(tracker);
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again please.");
            }
        }
        scanner.close();
    }

    private static void handleAddExpense(Scanner scanner, ExpenseTracker tracker){
        System.out.print("Enter expense description: ");
        String description = scanner.nextLine();

        System.out.print("Enter amount of expense: ");
        double amount;

        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid number. Expense not added.");
            return;
        }

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        Expense expense = tracker.addExpense(description, amount, category);
        System.out.println("Expense added: R" + expense);
    }

    private static void handleViewExpenses(ExpenseTracker tracker){
        List<Expense> expenses = tracker.getAllExpenses();

        if(expenses.isEmpty()){
            System.out.println("No expenses on record");
            return;
        }

        for (Expense expense : expenses){
            System.out.println(expense);
        }
    }

    private static void handleViewTotalExpenses(ExpenseTracker tracker){
        double total = tracker.getTotalExpenses();
        System.out.println("Total expense: " + total);
    }
}
