package Console_Based_Inventory_Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryManager {
    // In-memory storage
    static List<Inventory> inventoryList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean sysRunning = true;

        while (sysRunning) {

            System.out.println("==================== Inventory List ====================");
            System.out.println("1. Create Inventory");
            System.out.println("2. View Inventory Items");
            System.out.println("3. Update an Item");
            System.out.println("4. Delete an Item");
            System.out.println("5. Search Item by ID");
            System.out.println("6. Exit the application");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    createInventory(scanner);
                    break;
                case 2:
                    viewInventory();
                    System.out.println();
                    break;
                case 3:
                    updateItem(scanner);
                    break;
                case 4:
                    deleteItem(scanner);
                    break;
                case 5:
                    searchItem(scanner);
                    break;
                case 6:
                    sysRunning = false;
                    System.out.println("Successfully logged out.");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }

    static void createInventory(Scanner scanner) {

        System.out.print("Enter the item ID: ");
        String itemId = scanner.nextLine();

        System.out.print("Enter the item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter the item quantity: ");
        int itemQuantity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the item price: ");
        double itemPrice = scanner.nextDouble();
        scanner.nextLine();

        if (inventoryContains(itemId)) {
            System.out.println("Item with ID " + itemId + " already exists.");
        } else {
            inventoryList.add(new Inventory(itemId, itemName, itemQuantity, itemPrice));
            System.out.println("Item with ID " + itemId + " has been created.");
        }
    }

    private static boolean inventoryContains(String itemId){
        for (Inventory inventory : inventoryList){
            if(inventory.getItemId().equals(itemId)){
                return true;
            }
        }
        return false;
    }

    static void viewInventory() {
        for (Inventory inventory : inventoryList) {
            System.out.println(inventory);
            System.out.println();
        }
    }

    static void updateItem(Scanner scanner) {
        System.out.print("Enter item ID to update: ");
        String itemToUpdate = scanner.nextLine();

        boolean itemFound = false;

        for  (Inventory inventory : inventoryList) {
            if (inventory.getItemId().equals(itemToUpdate)) {
                System.out.println("1. Update itemName: ");
                System.out.println("2. Update itemQuantity: ");
                System.out.println("3. Update item price: ");
                System.out.print("Select an option: ");

                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        System.out.print("Enter item name: ");
                        inventory.setItemName(scanner.nextLine());
                        break;
                    case 2:
                        int currentQuantity = inventory.getQuantity();
                        System.out.println("Current quantity: " + currentQuantity);
                        System.out.print("Enter quantity number you want to add or subtract(Use negative for subtracting): ");

                        int newQuantity = scanner.nextInt();
                        scanner.nextLine();

                        int totalQuantity = currentQuantity + newQuantity;

                        if (totalQuantity > 0){
                            System.out.println("Quantity after updating: " + totalQuantity);
                            inventory.setQuantity(totalQuantity);
                        } else {
                            System.out.println("Stock cannot be negative, not updated.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter item new price: ");
                        double newPrice = scanner.nextDouble();
                        scanner.nextLine();

                        inventory.setPrice(newPrice);
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
                System.out.println();

                System.out.println("Successfully updated the item.");
                itemFound = true;
                break;
            }
        }

        if (!itemFound) {
            System.out.println("Item not found.");
        }
    }

    static void deleteItem(Scanner scanner) {
        System.out.print("Enter item ID to delete: ");
        String itemToDelete = scanner.nextLine();

        boolean itemFound = false;

        for (int i = inventoryList.size() - 1; i >= 0 ; i--) {
            Inventory inventory = inventoryList.get(i);

            if (inventory.getItemId().equals(itemToDelete)) {
                inventoryList.remove(i);
                System.out.println("Item with ID " + itemToDelete + " has been deleted.");
                itemFound = true;
                break;
            }
        }
        if (!itemFound) {
            System.out.println("Item with ID " + itemToDelete + " not found.");
        }

    }

    static void searchItem(Scanner scanner) {
        System.out.println("Enter item ID to search: ");
        String searchItemId = scanner.nextLine();

        boolean itemFound = false;
        for  (Inventory inventory : inventoryList) {
            if (inventory.getItemId().equals(searchItemId)) {
                System.out.println(inventory);
                itemFound = true;
                break;
            }
        }

        if (!itemFound) {
            System.out.println("Item not found.");
        }
    }
}
