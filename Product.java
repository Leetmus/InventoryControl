/**
 * Product
 */
public class Product {

    String name;
    String ID;
    double price;
    int quantity;

    public Product(String name, String ID, double price, int quantity) {
        this.name = name;
        this.ID = ID;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
}