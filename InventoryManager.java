import java.util.ArrayList;
import java.util.List;


public class InventoryManager {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void searchProductByName(String name) {
        for (Product product : products) {
            if (product.name.equals(name)) {
                System.out.println("Product found: " + product.name + ", ID: " + product.ID + ", Price: " + product.price + ", Quantity: " + product.quantity);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void updateProductQuantity(String ID, int newQuantity) {
        for (Product product : products) {
            if (product.ID.equals(ID)) {
                product.quantity = newQuantity;
                System.out.println("Product quantity updated: " + product.name + ", New Quantity: " + product.quantity);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    


    
}
