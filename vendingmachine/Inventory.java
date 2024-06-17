package vendingmachine;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Inventory {
    private final Map<Product, Integer> inventory;

    public Inventory() {
        inventory = new ConcurrentHashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        inventory.put(product, quantity);
    }

    public void removeProduct(Product product) {
        inventory.remove(product);
    }

    public void updateQuantity(Product product, int quantity) {
        inventory.put(product, quantity);
    }

    public int getQuantity(Product product) {
        return inventory.getOrDefault(product, 0);
    }

    public Boolean isAvailable(Product product) {
        return inventory.containsKey(product) && inventory.get(product) > 0;
    }
}
