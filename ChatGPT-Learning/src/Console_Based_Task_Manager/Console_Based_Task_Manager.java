package Console_Based_Task_Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console_Based_Task_Manager {
    static List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        // Console Based Task Manager

        Scanner scanner = new Scanner(System.in);

        boolean sysRunning = true;
        int option;

        while (sysRunning){
            System.out.println("================= Menu =================");
            System.out.println("1. Create a task.");
            System.out.println("2. View all created tasks.");
            System.out.println("3. Update an existing task.");
            System.out.println("4. Delete a task.");
            System.out.println("5. Exit.");
            System.out.print("Please select an option from the menu: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    createTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    System.out.println();
                    break;
                case 3:
                    updateExistingTask(scanner);
                    break;
                case 4:
                    deleteTask(scanner);
                    break;
                case 5:
                    sysRunning = false;
                    System.out.println("Successfully logged out.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
            System.out.println();
        }
        scanner.close();
    }

    static void createTask(Scanner scanner){
        System.out.println("================== Create a Task ==================");

        System.out.print("Please create a task ID: ");
        String taskId = scanner.nextLine().trim();

        System.out.print("Please create a title for: ");
        String titleOfTask = scanner.nextLine().trim();

        System.out.print("Please add a description of your task: ");
        String taskDescription = scanner.nextLine().trim();

        if (taskIdExist(taskId)){
            System.out.println("Task with that Id already exists. Please choose a different one.");
        } else if (!taskIdExist(taskId)){
            tasks.add(new Task(taskId, titleOfTask, taskDescription));
            System.out.println("Task successfully added");
        } else{
            System.out.println("Task not added successfully.");
        }
    }

    private static boolean taskIdExist(String taskId){
        for (Task task : tasks){
            if (task.getTaskId().equals(taskId)){
                return true;
            }
        }
        return false;
    }

    static void viewTasks(){
        for (Task task : tasks){
            System.out.println(task);
        }
    }

    static void updateExistingTask(Scanner scanner){
        System.out.print("Enter your taskId: ");
        String taskIdToUpdate = scanner.nextLine();

        boolean found = false;
        for (Task task : tasks){
            if (task.getTaskId().equals(taskIdToUpdate)){

                System.out.println("1. Update title");
                System.out.println("2. Update description");
                System.out.println("3. Mark as DONE");
                System.out.println("4. Mark as TODO");
                System.out.print("Select option: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter new title: ");
                        task.setTitleOfTask(scanner.nextLine());
                        break;
                    case 2:
                        System.out.print("Enter new description: ");
                        task.setTaskDescription(scanner.nextLine());
                        break;
                    case 3:
                        task.markAsDone();
                        break;
                    case 4:
                        task.markAsTodo();
                        break;
                    default:
                        System.out.println("Invalid option.");
                }

                System.out.println("Task successfully updated.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("That taskId does not exist.");
        }
    }

    static void deleteTask(Scanner scanner){
        System.out.print("Enter your taskId to delete: ");
        String taskIdToDelete = scanner.nextLine();

        for (int i = 0; i < tasks.size(); i++){
            Task task = tasks.get(i);

            if (task.getTaskId().equals(taskIdToDelete)){
                System.out.print("You are about to delete the task with taskId: " + taskIdToDelete + ". Please confirm with a (Yes or No): ");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("Yes")){
                    tasks.remove(i);
                    System.out.println("Task " + taskIdToDelete + " deleted successfully.");
                }else{
                    System.out.println("Task deletion cancelled.");
                }
                return;
            }
        }
        System.out.println("Task with taskId: " + taskIdToDelete + " not found.");
    }
}