package Console_Based_Inventory_Manager;

public class Inventory {

    // Fields
    private final String itemId;
    private String itemName;
    private int  quantity;
    private double price;

    // Constructor
    public Inventory(String itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters & Setters
    public String getItemId() {
        return itemId;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item ID : " + itemId +
                "\nItem Name : " + itemName +
                "\nQuantity : " + quantity +
                "\nPrice : R" + price;
    }
}
