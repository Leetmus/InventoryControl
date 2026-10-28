public class Main {
	public static void main(String[] args) {

        InventoryManager inventoryManager = new InventoryManager();

        // Adding products
        Product product1 = new Product("Laptop", "P001", 1200.00, 10);
        Product product2 = new Product("Smartphone", "P002", 800.00, 20);
        inventoryManager.addProduct(product1);
        inventoryManager.addProduct(product2);

        // Searching for a product
        inventoryManager.searchProductByName("Laptop");
        inventoryManager.searchProductByName("Tablet");

        // Updating product quantity
        inventoryManager.updateProductQuantity("P001", 15);
        inventoryManager.updateProductQuantity("P003", 5);

        // Removing a product
        inventoryManager.removeProduct(product1);
        inventoryManager.searchProductByName("Laptop");

        System.out.println("Product name: " + product1.getName());
        System.out.println("Product ID: " + product1.getID());
        System.out.println("Product price: " + product1.getPrice());
        System.out.println("Product quantity: " + product1.getQuantity());

    }
}

